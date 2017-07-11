package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateDeleteMessage;
import com.jcg.examples.viewBean.DeleteMessageBean;
import com.jcg.examples.viewBean.SignUpBean;

@Controller
public class DeleteAssignmentClient {
	
	@Autowired
	private DelegateDeleteMessage delegateDeleteMessage;
	
	@RequestMapping(value="/deleteAssignment",method=RequestMethod.POST)
	public ModelAndView deleteAssignment(HttpServletRequest request, HttpServletResponse response, SignUpBean signUpBean,  @ModelAttribute("DeleteMessageBean")DeleteMessageBean deleteMessageBean)
	{
	
		ModelAndView model=null;
		
		try
		{
			String result=delegateDeleteMessage.deleteAssignment(deleteMessageBean.getSno());
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("deleteMessageY", "Message deleted.");
				model=new ModelAndView("client");
						
			}
			else
			{
				request.setAttribute("deleteMessageN", "Message not deleted. Try Again.");
				model=new ModelAndView("client");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return model;
	}

}
