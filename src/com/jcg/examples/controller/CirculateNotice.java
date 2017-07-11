package com.jcg.examples.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateCirculateNotice;

import com.jcg.examples.viewBean.CirculateNoticeBean;


@Controller
public class CirculateNotice {
	
	@Autowired
	private DelegateCirculateNotice delegateCirculateNotice;
	
	@RequestMapping(value="/circulateNotice",method=RequestMethod.GET)
	public ModelAndView circulateNoticeGet(HttpSession session)
	{
		ModelAndView model = new ModelAndView("circulateNotice");

		session.setAttribute("username", session.getAttribute("username"));
		return model;
	}
	
	@RequestMapping(value="/circulateNotice",method=RequestMethod.POST)
	public ModelAndView circulateNoticePost(HttpServletRequest request, HttpSession session,  @ModelAttribute("circulateNoticeBean")CirculateNoticeBean circulateNoticeBean)
	{
		ModelAndView model=null;
		request.setAttribute("username", session.getAttribute("username"));
		try
		{
			
			String result=delegateCirculateNotice.circulateNotice(session.getAttribute("username").toString(), circulateNoticeBean.getNotice());
			
			if(result.equalsIgnoreCase("ok"))
			{
				model=new ModelAndView("admin");
				request.setAttribute("circulateNoticeY", "Your Notice has been circulated.");
			}
			
			else if(result.equalsIgnoreCase("not"))
			{
				model=new ModelAndView("admin");
				request.setAttribute("circulateNotice", "Your Notice has NOT been circulated.Try Again!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return model;
	
	}
	

}
