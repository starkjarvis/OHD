package com.jcg.examples.controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateDeleteNotice;
import com.jcg.examples.delegate.DelegateShowNotice;


@Controller
public class DeleteNotice {
	
	@Autowired
	private DelegateShowNotice delegateShowNotice;
	
	@Autowired
	private DelegateDeleteNotice delegateDeleteNotice;
	
	@RequestMapping(value="/deleteNotice",method=RequestMethod.GET)
	public ModelAndView deleteAssignment(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model=new ModelAndView("showNotice");
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		try
		{
			res=delegateShowNotice.showNotice();
			while(res.next()){
				String[] dataArray = new String[5];
				dataArray[0] = res.getString(1);
				dataArray[1] = res.getString(2);
				dataArray[2] = res.getString(3);
				dataArray[3] = res.getString(4);
				dataArray[4] = res.getString(5);
				
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
	

	@RequestMapping(value="/deleteNotice1",method=RequestMethod.POST)
	public ModelAndView deleteNotice1(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView model=null;
		
		String sno1= request.getParameter("sno");
		int sno=Integer.parseInt(sno1);
		
		try
		{
			String result=delegateDeleteNotice.deleteNotice(sno);
			
			if(result.equalsIgnoreCase("ok"))
			{
				request.setAttribute("deleteNoticeY", "Notice Deleted.");
				model=new ModelAndView("admin");
						
			}
			else
			{
				request.setAttribute("deleteNoticeN", "Notice not deleted. Try Again.");
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
