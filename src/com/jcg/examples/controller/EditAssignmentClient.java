package com.jcg.examples.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
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

import com.jcg.examples.delegate.DelegateGetMessage;
import com.jcg.examples.delegate.DelegateShowAssignment;
import com.jcg.examples.delegate.DelegateUpdateAssignment;
import com.jcg.examples.viewBean.AddAssignmentBean;
import com.jcg.examples.viewBean.DeleteMessageBean;
import com.jcg.examples.viewBean.SignUpBean;

@Controller
public class EditAssignmentClient {
	
	@Autowired
	private DelegateUpdateAssignment delegateUpdateAssignment;
	@Autowired
	private DelegateShowAssignment delegateShowAssignment;
	
	@Autowired
	private DelegateGetMessage delegateGetMessage;
	
	@RequestMapping(value="/editAssignment1",method=RequestMethod.GET)
	public ModelAndView editAssignment1(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("DeleteMessageBean")DeleteMessageBean deleteMessageBean, HttpSession session)
	{
		ModelAndView model=new ModelAndView("editAssignment1");
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		try
		{
			String email=session.getAttribute("username").toString();
			System.out.println(email);
			res= delegateShowAssignment.showAssignmentClient(email);
			while(res.next()){
				String[] dataArray = new String[7];
				dataArray[0] = res.getString(1);
				dataArray[1] = res.getString(2);
				dataArray[2] = res.getString(3);
				dataArray[3] = res.getString(4);
				dataArray[4] = res.getString(5);
				dataArray[5] = res.getString(6);
				dataArray[6] = res.getString(7);
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
	
	
	
	@RequestMapping(value="/editAssignment2",method=RequestMethod.POST)
	public ModelAndView editAssignment2(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("DeleteMessageBean")DeleteMessageBean deleteMessageBean, HttpSession session)
	{
		ModelAndView model=new ModelAndView("editAssignment2");
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		try
		{
			String email=session.getAttribute("username").toString();
			System.out.println(email);
			res= delegateShowAssignment.showAssignmentClient(email);
			while(res.next()){
				String[] dataArray = new String[7];
				dataArray[0] = res.getString(1);
				dataArray[1] = res.getString(2);
				dataArray[2] = res.getString(3);
				dataArray[3] = res.getString(4);
				dataArray[4] = res.getString(5);
				dataArray[5] = res.getString(6);
				dataArray[6] = res.getString(7);
				data.add(dataArray);
			}
	 	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		request.setAttribute("data", data);
		model.addObject("dataList", data);
		model.addObject("sno", request.getParameter("sno"));


		
		return model;
	}
	
	
	@RequestMapping(value="/editAssignment3",method=RequestMethod.POST)
	public ModelAndView editAssignment3(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("AddAssignmentBean")AddAssignmentBean addAssignmentBean, HttpSession session)
	{
		
		ModelAndView model=null;
		String sno1= request.getParameter("sno");
		int sno=Integer.parseInt(sno1);
		Date date=new Date();
		try
		{
			String result=delegateUpdateAssignment.UpdateAssignmentClient(addAssignmentBean.getFullName(), addAssignmentBean.getEmail(), addAssignmentBean.getEndDate(), addAssignmentBean.getAssignmentdescription(), date.toGMTString().substring(0,11), addAssignmentBean.getTypeOfEvent(), sno);
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("UpdateAssignmentY", "Assignment has been updated.");
				model=new ModelAndView("client");
			}
			else if(result.equalsIgnoreCase("not"))
			{
				request.setAttribute("UpdateAssignmentN", "Assignment has not been updated. Try again please.");
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
