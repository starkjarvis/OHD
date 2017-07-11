<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Query</title>
</head>
<body background="img/blue.jpg" style="background-size:cover;">
		<jsp:include page="navigationBar.jsp"></jsp:include>
		<br>
		<center><h1 class="heading" style="color:#2f4f4f;">Register your query </h1></center>
		<div class="container">
		<center>
		<%
			Date date1=new Date();
			
			String date=date1.toGMTString().substring(0,11);
		%>
	
			<form action="addAssignmentClient" method="post" modelAttribute="addAssignmentBean" class="form-horizontal">
			<br>
		    	<div class="form-group">
                    <label for="firstName" class="col-sm-2 control-label">Full Name</label>
                    <div class="col-sm-10">
                        <input type="text" name="fullName" placeholder="Full Name" class="form-control" autofocus>
                        <span class="help-block">Last Name, First Name, Example: Harry Smith</span>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" name="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="birthDate" class="col-sm-2 control-label">Date (optional)</label>
                    <div class="col-sm-10">
                        <input type="date"  value="<%=date%>" name="endDate" class="form-control">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="usertype" class="col-sm-2 control-label">Query is related to</label>
                    <div class="col-sm-10">
                        <select name="typeOfEvent" class="form-control">
                            <option>Select</option>
                            <option>Exams</option>
                            <option>Results</option>
                            <option>Campus help</option>
                            <option>Leave</option>
                            <option>Contact information</option>
                            <option>Notice</option>
                        </select>
                   </div>
                 </div>
                
                <div class="form-group row">
    				<label for="inputTo" class="col-sm-2 control-label">Query Description</label>
    				<div class="col-sm-10">
      					<textarea class="form-control noresize" name="assignmentdescription" cols="6" rows="5" placeholder="type your description here.."></textarea>
    				</div>
  				</div>
                <br>
				<input type="submit" value="Add" style="width:20%;" class="btn btn-md btn-primary btn-block" >
			</form>
		</center>
	</div>
	
</body>
</html>