package com.jcg.examples.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LogoutController {
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpSession session)
	{
		ModelAndView model = new ModelAndView("logout");
		
		return model;
	}
}
