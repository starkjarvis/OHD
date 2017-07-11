<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	 <center>
    	<div class="container header-content">
            <div class="row">
            <center><h3 style="color: RED;">${changePasswordN}</h3></center>
			<center><h3 style="color: GREEN;">${changePasswordY}</h3></center>
            <h2 class="section-heading">Change Password</h2>
                    <hr class="primary">
                
                	<form  method="post" action="changePassword1" modelAttribute="changePasswordBean">

				<span class="style1" class="sr-only" style="color:black; font-size:18px;"><b>Old Password</b></span>
				<input class="form-control" type="password" style="width:50%;" id="OldPassword" placeholder="Old Password" name="OldPassword" /><br>
				<span class="style1" class="sr-only" style="color:black; font-size:18px;"><b>New Password</b></span>
				<input style="width:50%;" type="password" class="form-control" placeholder="New Password" required width="35%" id="password" placeholder="New Password" name="NewPassword"  /><br>
				<input type="submit" value="Update Password" style="width:20%;" class="btn btn-lg btn-primary btn-block" />
				
			</form>
			
                
               </div>
               
         </div>
         </center>
</body>
</html>