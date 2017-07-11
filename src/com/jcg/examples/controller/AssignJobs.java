package com.jcg.examples.controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateAssignJobs;
import com.jcg.examples.delegate.DelegateShowAssignment;
import com.jcg.examples.viewBean.AssignToBean;


@Controller
public class AssignJobs {
	
	@Autowired
	private DelegateShowAssignment delegateShowAssignment;
	
	@Autowired
	private DelegateAssignJobs delegateAssignJobs;
	
	
	@RequestMapping(value="/assignJobs1", method=RequestMethod.GET)
	public ModelAndView showAssignJobs1(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		
		ModelAndView model=new ModelAndView("assignJobs1");
		
		return model;
	}
	
	@RequestMapping(value="/neterror", method=RequestMethod.GET)
	public ModelAndView neterror(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		
		ModelAndView model=new ModelAndView("neterror");
		
		return model;
	}
	
	@RequestMapping(value="/assignJobs", method=RequestMethod.GET)
	public ModelAndView showAssignJobs(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		ModelAndView model=new ModelAndView("assignJobs1");
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		try
		{
			String email=session.getAttribute("username").toString();
			System.out.println(email);
			res= delegateShowAssignment.showAssignmentAdmin();
			while(res.next()){
				String[] dataArray = new String[7];
				dataArray[0] = res.getString(1);
				dataArray[1] = res.getString(2);
				dataArray[2] = res.getString(3);
				dataArray[3] = res.getString(4);
				dataArray[4] = res.getString(5);
				dataArray[5] = res.getString(6);
				
				data.add(dataArray);
			}
	 	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		request.setAttribute("data", data);
		model.addObject("dataList", data);
		
		
		
		return model;
	}
	
	
	
	
	
	@RequestMapping(value="/assignJobs2", method=RequestMethod.POST)
	public ModelAndView showAssignJobs3(HttpServletRequest request, HttpServletResponse response, HttpSession session,  @ModelAttribute("AssignToBean")AssignToBean assignToBean)
	{
		ModelAndView model=new ModelAndView("admin");
		
		String sno1=request.getParameter("sno");
		
		
		
		
		try
		{
			String result=delegateAssignJobs.assignJobs(assignToBean.getEmail(), Integer.parseInt(sno1));
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("assignJobsY", "Job has been assigned.");
				
			}
			else
			{
				request.setAttribute("assignJobsN", "Job has not been assigned. Try again.");
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return model;
	}

}
