<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.Date" %>
   <%@page import="javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Assignment</title>
</head>
<body style="background-color: #d3d3d3;">
		<jsp:include page="navigationBar.jsp"></jsp:include>
		<br>
		<center><h1 class="heading" style="color:#2f4f4f;">Edit an Assignment </h1></center>
		<div class="container">
		<center>
		<%
			Date date1=new Date();
			
			String date=date1.toGMTString().substring(0,11);
			ArrayList<String[]> data= (ArrayList<String[]>)request.getAttribute("data");
			String s[];
			int count=0;
			
			for(int i=0;i<data.size();i++)
			{
				s=data.get(i);
				int j=0;
			
			
		%>
	
			<form action="editAssignment3" method="post" modelAttribute="AddAssignmentBean" class="form-horizontal" >
			<br>
		    	<div class="form-group">
                    <label for="firstName" class="col-sm-2 control-label">Full Name</label>
                    <div class="col-sm-10">
                        <input type="text"  name="fullName"  value="<%=s[0] %>" placeholder="Full Name" class="form-control" autofocus>
                        <span class="help-block">Last Name, First Name, Example: Harry Smith</span>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" value="<%=s[1]%>" name="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="birthDate" class="col-sm-2 control-label">End date</label>
                    <div class="col-sm-10">
                        <input type="date"  value="<%=s[2]%>" name="endDate" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="usertype" class="col-sm-2 control-label">Type of Event</label>
                    <div class="col-sm-10">
                        <select name="typeOfEvent" class="form-control" value="<%=s[6] %>">
                            <option>Select</option>
                            <option>Marriage</option>
                            <option>Birthday</option>
                            <option>Party</option>
                            <option>Other</option>
                        </select>
                   </div>
                 </div>
                
                <div class="form-group row">
    				<label for="inputTo" class="col-sm-2 control-label">Assignment Description</label>
    				<div class="col-sm-10">
      					<textarea class="form-control noresize"  name="assignmentdescription" cols="6" rows="5" placeholder="type your description here.."><%=s[3] %></textarea>
    				</div>
  				</div>
                <br>
                <input type="hidden" name="sno" id="sno" value="${sno}">
				<input type="submit"  value="Update" style="width:20%;" class="btn btn-md btn-primary btn-block" >
				
			</form>
		</center>
	</div>
	<%} %>
</body>
</html>