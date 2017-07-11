<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<style>
textarea {
    resize: none;
}

.center_div{
    margin: 0 auto;
    width:50% /* value of your choice which suits your alignment */
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Message</title>
</head>


<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	
		
		<br>
		<center><h1 class="style2" class="form-signin-heading">Send a Message</h1></center>
		<hr>
		<br>	
		<div class="container">
			<form class="form-row" action="sendMessageAdmin" method="post" methodAttribute="sendMessageAdminBean">
  			<center>
  			<h3 style="color:GREEN;">${sendMessageAdminY }</h3>
  			<h3 style="color:RED;">${sendMessageAdminN }</h3>
  			<div class="form-group row">
    			<label for="inputTo" class="col-sm-1 control-label">To</label>
    			<div class="col-sm-10">
      				<input type="text" name="toEmail" class="form-control" placeholder="Enter recipient's email here..">
    			</div>
  			</div>
  			
  			<div class="form-group row">
    			<label for="inputTo" class="col-sm-1 control-label">Message</label>
    			<div class="col-sm-10">
      				<textarea class="form-control noresize" name="message" cols="6" rows="8" placeholder="type your message here.."></textarea>
    			</div>
  			</div>
  
  

  			<div class="form-group">
    			<input type="submit" value="Send" style="width:20%;" class="btn btn-md btn-primary btn-block" >
    			<br><center><a href="admin" style="font-size:20px; color:GREEN;"><b>Go Back</b></a></center>
  			</div>
  		</center>
  
		</form>

	</div>
		
	
</body>

</html>