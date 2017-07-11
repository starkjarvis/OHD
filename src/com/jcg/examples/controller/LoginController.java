package com.jcg.examples.controller;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcg.examples.delegate.DelegateDeleteMessage;
import com.jcg.examples.delegate.DelegateGetMessage;
import com.jcg.examples.delegate.LoginDelegate;
import com.jcg.examples.viewBean.DeleteMessageBean;
import com.jcg.examples.viewBean.LoginBean;
import com.jcg.examples.viewBean.SignUpBean;


@Controller
public class LoginController
{
	
	static int count=0;
		@Autowired
		private LoginDelegate loginDelegate;
		@Autowired
		private DelegateGetMessage delegateGetMessage;
		@Autowired
		private DelegateDeleteMessage delegateDeleteMessage;
		String email;
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		{
			ModelAndView model = new ModelAndView("login");
			
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			return model;
		}
		
		@RequestMapping(value="/signup",method=RequestMethod.GET)
		public ModelAndView displaySignUp(HttpServletRequest request, HttpServletResponse response, SignUpBean signUpBean)
		{
			ModelAndView model = new ModelAndView("SignUp");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			return model;
		}
		
		@RequestMapping(value="/client",method=RequestMethod.GET)
		public ModelAndView displayStudent(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("client");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			return model;
		}
		
		@RequestMapping(value="/client1",method=RequestMethod.GET)
		public ModelAndView displayStudent1(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("client");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
		
			return model;
		}
		
		@RequestMapping(value="/admin",method=RequestMethod.GET)
		public ModelAndView displayAdmin(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("admin");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			
		
			
			return model;
		}
                
                @RequestMapping(value="/student",method=RequestMethod.GET)
		public ModelAndView displayStudentt(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("student");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			
		
			
			return model;
		}
		
               
                
                @RequestMapping(value="/staff",method=RequestMethod.GET)
		public ModelAndView displayStaff(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("staff");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			
		
			
			return model;
		}
                
		@RequestMapping(value="/admin1",method=RequestMethod.GET)
		public ModelAndView displayAdmin1(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("admin");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);

			return model;
		}
		
		
		@RequestMapping(value="/employee",method=RequestMethod.GET)
		public ModelAndView displayEmployee(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("employee");
			
			return model;
		}
		
		
		@RequestMapping(value="/employee1",method=RequestMethod.GET)
		public ModelAndView displayEmployee1(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("employee");
		
			return model;
		}
                
                @RequestMapping(value="/faculty",method=RequestMethod.GET)
		public ModelAndView displayFaculty(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean, HttpSession session)
		{
			session.getAttribute("username").toString();
			ModelAndView model = new ModelAndView("faculty");
		
			return model;
		}
		
		
		@RequestMapping(value="/viewTableAdmin", method=RequestMethod.GET)
		public ModelAndView displayMessageTable(HttpServletRequest request, HttpServletResponse response, HttpSession session)
		{
			ModelAndView model=new ModelAndView("ViewTableAdmin");
			ArrayList<String[]> data = new ArrayList<String[]>();
			ResultSet res = null;
			try
			{
				String email=session.getAttribute("username").toString();
				
				res= delegateGetMessage.getMessage(email);
				while(res.next()){
					String[] dataArray = new String[6];
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
		
		@RequestMapping(value="/viewTableEmployee", method=RequestMethod.GET)
		public ModelAndView displayMessageTableEmployee(HttpServletRequest request, HttpServletResponse response, HttpSession session)
		{
			ModelAndView model=new ModelAndView("viewTableEmployee");
			ArrayList<String[]> data = new ArrayList<String[]>();
			ResultSet res = null;
			try
			{
				String email=session.getAttribute("username").toString();
				
				res= delegateGetMessage.getMessage(email);
				while(res.next()){
					String[] dataArray = new String[6];
					dataArray[0] = res.getString(1);
					dataArray[1] = res.getString(2);
					dataArray[2] = res.getString(3);
					dataArray[3] = res.getString(4);
					dataArray[4] = res.getString(5);
					dataArray[5]=res.getString(6);
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
		
		@RequestMapping(value="/viewTableClient", method=RequestMethod.GET)
		public ModelAndView viewTableClient(HttpServletRequest request, HttpServletResponse response, HttpSession session)
		{
			ModelAndView model=new ModelAndView("ViewTableClient");
			ArrayList<String[]> data = new ArrayList<String[]>();
			ResultSet res = null;
			try
			{
				String email=session.getAttribute("username").toString();
				
				res= delegateGetMessage.getMessage(email);
				while(res.next()){
					String[] dataArray = new String[6];
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
		
		
		
		@RequestMapping(value="/termsandconditions",method=RequestMethod.GET)
		public ModelAndView displayTermsAndConditions(HttpServletRequest request, HttpServletResponse response, LoginBean loginBean)
		{
			ModelAndView model = new ModelAndView("termsAndConditions");
			//LoginBean loginBean = new LoginBean();
			//model.addObject("loginBean", loginBean);
			return model;
		}
		
		
		
		
		
		@RequestMapping(value="/login",method=RequestMethod.POST)
		public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean,HttpSession session)
		{
				ModelAndView model= null;
				String usertype ="";
				try
				{
						usertype = loginDelegate.isValidUser(loginBean.getEmail(), loginBean.getPassword()).toLowerCase();
						if(usertype != null && usertype.equalsIgnoreCase("client"))
						{
								System.out.println("User Login Successful for Client");
								request.setAttribute("loggedInUser", loginBean.getEmail());
								
								model = new ModelAndView("client");
								session.setAttribute("username", loginBean.getEmail());
                                                                
								count++;
								System.out.println("Count: "+count);
						}
						
						else if(usertype!= null && usertype.equalsIgnoreCase("admin"))
						{
							
							System.out.println("User Login Successful for Admin");
							request.setAttribute("loggedInUser", loginBean.getEmail());
							model = new ModelAndView("admin");
							
                                                        session.setAttribute("username", loginBean.getEmail());
							count++;
							System.out.println("Count: "+count);
							
						}
                                                else if(usertype!= null && usertype.equalsIgnoreCase("admin"))
						{
							
							System.out.println("User Login Successful for Admin");
							request.setAttribute("loggedInUser", loginBean.getEmail());
							model = new ModelAndView("admin");
							
                                                        session.setAttribute("username", loginBean.getEmail());
							count++;
							System.out.println("Count: "+count);
							
						}
                                                
                                                else if(usertype!= null && usertype.equalsIgnoreCase("faculty"))
						{
							
							System.out.println("User Login Successful for Faculty");
							request.setAttribute("loggedInUser", loginBean.getEmail());
							model = new ModelAndView("faculty");
							session.setAttribute("username", loginBean.getEmail());
							count++;
							System.out.println("Count: "+count);
							
						}
						
						else if(usertype!= null && usertype.equalsIgnoreCase("student"))
						{
							System.out.println("User Login Successful for Student");
							request.setAttribute("loggedInUser", loginBean.getEmail());
							
                                                        model = new ModelAndView("student");
							session.setAttribute("username", loginBean.getEmail());
							count++;
							System.out.println("Count: "+count);
						}
                                                
                                                else if(usertype!= null && usertype.equalsIgnoreCase("staff"))
						{
							
							System.out.println("User Login Successful for Staff");
							request.setAttribute("loggedInUser", loginBean.getEmail());
							model = new ModelAndView("staff");
							
                                                        session.setAttribute("username", loginBean.getEmail());
							count++;
							System.out.println("Count: "+count);
							
						}
						
						else
						{
								model = new ModelAndView("login");
								request.setAttribute("message", "Invalid credentials entered. Try again.");
						}

				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				//model.addObject("usertype",usertype);
				session.setAttribute("usertype", usertype);
						
				return model;
		}
		
		
		@RequestMapping(value="/delete",method=RequestMethod.POST)
		
		public ModelAndView deleteMessage(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("DeleteMessageBean")DeleteMessageBean deleteMessageBean,HttpSession session)
		{
			ModelAndView model=null;
		
			try
			{
				String result=delegateDeleteMessage.deleteMessage(deleteMessageBean.getSno());
				if(result.equalsIgnoreCase("ok"))
				{
					request.setAttribute("deleteMessageY", "Message deleted.");
					model=new ModelAndView("admin");
							
				}
				else
				{
					request.setAttribute("deleteMessageN", "Message not deleted. Try Again.");
					model=new ModelAndView("admin");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			return model;
		}
		
		
		@RequestMapping(value="/signup",method=RequestMethod.POST)
		public ModelAndView executeSignUp(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("signUpBean")SignUpBean signUpBean,HttpSession session)
		{
				ModelAndView model= null;
				
				
					    try {
							String result =loginDelegate.registerSignUp(signUpBean.getFullName(), signUpBean.getEmail(), signUpBean.getPassword(), signUpBean.getDateOfBirth(), signUpBean.getUsertype(), signUpBean.getGender()).toLowerCase();     
							System.out.println(result);
							if(result.equalsIgnoreCase("ok"))
							{
							request.setAttribute("signUp", "Registration successfull. Login in to continue.");
							
							model=new ModelAndView("login");
							}
							else
							{
								request.setAttribute("signUpU", "Registration UNSUCCESSFUL. Try another email address.");
								model=new ModelAndView("SignUp");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					    
						

				
				
				
				return model;
		}
		
}
