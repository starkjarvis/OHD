package com.jcg.examples.controller;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jcg.examples.delegate.DelegateAddAssignment;
import com.jcg.examples.viewBean.AddAssignmentBean;


@Controller
public class AddAssignmentClient {
	
	@Autowired
	private DelegateAddAssignment addAssignmentClientService;
	
	@RequestMapping(value="/addAssignmentClient",method=RequestMethod.GET)
	public ModelAndView displayAddAssignment(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model = new ModelAndView("addAssignmentClient");
		
		return model;
	}
	
	@RequestMapping(value="/addAssignmentClient",method=RequestMethod.POST)
	public ModelAndView executeAddAssignment(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("addAssignmentBean")AddAssignmentBean addAssignmentBean)
	{
		

		Date date=new Date();
		ModelAndView model = null;
		try{
			
			String result=addAssignmentClientService.addAssignmentClient(addAssignmentBean.getFullName(), addAssignmentBean.getEmail(), addAssignmentBean.getEndDate(), addAssignmentBean.getAssignmentdescription(), date.toGMTString().substring(0,11), addAssignmentBean.getTypeOfEvent() );
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("AddAssignmentY", "Query has been sent.");
				model=new ModelAndView("client");
			}
			else if(result.equalsIgnoreCase("not"))
			{
				request.setAttribute("AddAssignmentN", "Query not sent. Try again please.");
				model=new ModelAndView("client");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return model;
	}
}
