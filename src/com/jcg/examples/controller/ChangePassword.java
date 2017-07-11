package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateChangePassword;
import com.jcg.examples.viewBean.ChangePasswordBean;


@Controller
public class ChangePassword {
	
	@Autowired
	private DelegateChangePassword delegateChangePassword;
	
	@RequestMapping(value="/changePassword",method=RequestMethod.GET)
	public ModelAndView changePasswordGET(HttpServletRequest request, HttpSession session, @ModelAttribute("changePasswordBean")ChangePasswordBean changePasswordBean)
	{
		ModelAndView model=new ModelAndView("changePassword");
		
		return model;

	}
	
	@RequestMapping(value="/changePassword1",method=RequestMethod.POST)
	public ModelAndView changePasswordPOST(HttpServletRequest request, HttpSession session, @ModelAttribute("changePasswordBean")ChangePasswordBean changePasswordBean)
	{
		ModelAndView model=new ModelAndView("changePassword");
		try
		{
			String result=delegateChangePassword.changePassword(session.getAttribute("username").toString(), changePasswordBean.getOldPassword(), changePasswordBean.getNewPassword());
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("changePasswordY", "Password Changed.");
				model=new ModelAndView("changePassword");
						
			}
			else
			{
				request.setAttribute("changePasswordN", "Password not changed. Try again with correct credentials");
				model=new ModelAndView("changePassword");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
}
