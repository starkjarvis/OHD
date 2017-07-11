package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateSendMessage;
import com.jcg.examples.viewBean.SendMessageBean;


@Controller
public class SendMessageController {
	
	@Autowired
	private DelegateSendMessage delegateSendMessage;
	
	@RequestMapping(value="/sendMessageAdmin",method=RequestMethod.GET)
	public ModelAndView displaysendMessageAdmin(HttpSession session)
	{
		ModelAndView model = new ModelAndView("sendMessageAdmin");
		
		return model;
	}
	
	@RequestMapping(value="/sendMessageEmployee",method=RequestMethod.GET)
	public ModelAndView displaysendMessageEmployee(HttpSession session)
	{
		ModelAndView model = new ModelAndView("sendMessageEmployee");
		
		return model;
	}
	
	@RequestMapping(value="/sendMessageClient",method=RequestMethod.GET)
	public ModelAndView displaysendMessageClient(HttpSession session)
	{
		ModelAndView model = new ModelAndView("sendMessageClient");
		
		return model;
	}
	
	@RequestMapping(value="/sendMessageAdmin",method=RequestMethod.POST)
	public ModelAndView executesendMessageAdmin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("sendMessageAdminBean")SendMessageBean sendMessageAdminBean,HttpSession session)
	{
		session.setAttribute("username", session.getAttribute("username")); 
		ModelAndView model= null;
		String result ="";
		
		
		try
		{
			result=delegateSendMessage.sendMessage(sendMessageAdminBean.getToEmail(), sendMessageAdminBean.getMessage(), session.getAttribute("username").toString());
			if(result.equalsIgnoreCase("ok"))
			{
				model=new ModelAndView("sendMessageAdmin");
				request.setAttribute("sendMessageAdminY", "Your Message has been sent.");
			}
			
			else if(result.equalsIgnoreCase("not"))
			{
				model=new ModelAndView("sendMessageAdmin");
				request.setAttribute("sendMessageAdminN", "Your Message has NOT been sent.Try Again!");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/sendMessageEmployee",method=RequestMethod.POST)
	public ModelAndView executesendMessageEmployee(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("sendMessageAdminBean")SendMessageBean sendMessageAdminBean,HttpSession session)
	{
		session.setAttribute("username", session.getAttribute("username")); 
		ModelAndView model= null;
		String result ="";
		
		
		try
		{
			result=delegateSendMessage.sendMessage(sendMessageAdminBean.getToEmail(), sendMessageAdminBean.getMessage(), session.getAttribute("username").toString());
			if(result.equalsIgnoreCase("ok"))
			{
				model=new ModelAndView("sendMessageEmployee");
				request.setAttribute("sendMessageAdminY", "Your Message has been sent.");
			}
			
			else if(result.equalsIgnoreCase("not"))
			{
				model=new ModelAndView("sendMessageEmployee");
				request.setAttribute("sendMessageAdminN", "Your Message has NOT been sent.Try Again!");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/sendMessageClient",method=RequestMethod.POST)
	public ModelAndView executesendMessageClient(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("sendMessageAdminBean")SendMessageBean sendMessageAdminBean,HttpSession session)
	{
		session.setAttribute("username", session.getAttribute("username")); 
		ModelAndView model= null;
		String result ="";
		
		
		try
		{
			result=delegateSendMessage.sendMessage(sendMessageAdminBean.getToEmail(), sendMessageAdminBean.getMessage(), session.getAttribute("username").toString());
			if(result.equalsIgnoreCase("ok"))
			{
				model=new ModelAndView("sendMessageClient");
				request.setAttribute("sendMessageAdminY", "Your Message has been sent.");
			}
			
			else if(result.equalsIgnoreCase("not"))
			{
				model=new ModelAndView("sendMessageClient");
				request.setAttribute("sendMessageAdminN", "Your Message has NOT been sent.Try Again!");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return model;
	}
}
