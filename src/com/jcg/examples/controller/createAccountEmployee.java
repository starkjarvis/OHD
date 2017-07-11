package com.jcg.examples.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.LoginDelegate;
import com.jcg.examples.viewBean.SignUpBean;

@Controller
public class createAccountEmployee {

	@Autowired
	private LoginDelegate loginDelegate;
	
	@RequestMapping(value="/createAccountEmployee",method=RequestMethod.GET)
	public ModelAndView displayCreateAccountEmployee(HttpServletRequest request, HttpServletResponse response, SignUpBean signUpBean)
	{
		ModelAndView model = new ModelAndView("createAccountEmployee");
		//LoginBean loginBean = new LoginBean();
		//model.addObject("loginBean", loginBean);
		return model;
	}
	
	@RequestMapping(value="/createAccountEmployee",method=RequestMethod.POST)
	public ModelAndView executeCreateAccountEmployee(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("signUpBean")SignUpBean signUpBean,HttpSession session)
	{
			ModelAndView model= null;
			
			
				    try {
						String result =loginDelegate.registerSignUp(signUpBean.getFullName(), signUpBean.getEmail(), signUpBean.getPassword(), signUpBean.getDateOfBirth(), signUpBean.getUsertype(), signUpBean.getGender()).toLowerCase();     
						System.out.println(result);
						if(result.equalsIgnoreCase("ok"))
						{
						request.setAttribute("signUp", "Registration successfull.");
						
						model=new ModelAndView("employee");
						}
						else
						{
							request.setAttribute("signUpU", "Registration UNSUCCESSFUL. Try another email address.");
							model=new ModelAndView("employee");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
					

			
			
			
			return model;
	}
}
