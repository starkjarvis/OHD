package com.jcg.examples.controller;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateShowRegistrationTable;

@Controller
public class RegistrationTable {
	
	@Autowired
	private DelegateShowRegistrationTable delegateShowRegistrationTable;
	
	@RequestMapping(value="/showRegistrationTable",method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session)
	{
		ModelAndView model = new ModelAndView("showRegistrationTable");
		ArrayList<String[]> data = new ArrayList<String[]>();
		ResultSet res = null;
		try
		{
			
			res= delegateShowRegistrationTable.showRegistrationTable();
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

}
