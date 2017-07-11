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

import com.jcg.examples.delegate.DelegateDeleteAssignedJobs;
import com.jcg.examples.delegate.DelegateShowAssignedJobs;
import com.jcg.examples.viewBean.AddAssignmentBean;
import com.jcg.examples.viewBean.DeleteMessageBean;

@Controller
public class EditAssignedJobs {
	
	@Autowired
	private DelegateShowAssignedJobs delegateShowAssignedJobs;
	
	@Autowired
	private DelegateDeleteAssignedJobs delegateDeleteAssignedJobs;
	
	@RequestMapping(value="/deleteAssignedJobs1",method=RequestMethod.GET)
	public ModelAndView editAssignedJobs1(HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		ModelAndView model=new ModelAndView("deleteAssignedJobs1");
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		
		try
		{
			res=delegateShowAssignedJobs.showAssignedJobs(session.getAttribute("username").toString());
			while(res.next()){
				String[] dataArray = new String[8];
				dataArray[0] = res.getString(1);
				dataArray[1] = res.getString(2);
				dataArray[2] = res.getString(3);
				dataArray[3] = res.getString(4);
				dataArray[4] = res.getString(5);
				dataArray[5] = res.getString(6);
				dataArray[6] = res.getString(7);
				dataArray[7] = res.getString(8);
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
	

	
	
	@RequestMapping(value="/deleteAssignedJobs2",method=RequestMethod.POST)
	public ModelAndView editAssignedJobs3(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		ModelAndView model=null;
		String sno1= request.getParameter("sno");
		int sno=Integer.parseInt(sno1);
		
		try
		{
			String result=delegateDeleteAssignedJobs.deleteAssignedJobs(sno);
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("deleteAssignedJobsY", "Job deleted.");
				model=new ModelAndView("admin");
						
			}
			else
			{
				request.setAttribute("deleteAssignedJobsN", "Job not deleted. Try Again.");
				model=new ModelAndView("admin");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return model;
		
	}
}
