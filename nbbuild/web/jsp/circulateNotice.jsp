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
<title>Circulate Notice</title>
</head>


<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	
		
		<br>
		<center><h1 class="style2" class="form-signin-heading">Circulate Notice</h1></center>
		<hr>
		<br>	
		<div class="container">
			<form class="form-row" action="circulateNotice" method="post" methodAttribute="circulateNoticeBean">
  			<center>
  		
  			<div class="form-group row">
    			<label for="inputTo" class="col-sm-1 control-label">From</label>
    			<div class="col-sm-10">
      				<input type="text" name="toEmail" value="<%=session.getAttribute("username") %>" class="form-control" placeholder="Enter recipient's email here..">
    			</div>
  			</div>
  			
  			<div class="form-group row">
    			<label for="inputTo" class="col-sm-1 control-label">Notice</label>
    			<div class="col-sm-10">
      				<textarea class="form-control noresize" name="notice" cols="6" rows="8" placeholder="notice.."></textarea>
    			</div>
  			</div>
  
  

  			<div class="form-group">
    			<input type="submit" value="Circulate" style="width:20%;" class="btn btn-md btn-primary btn-block" >
  			</div>
  		</center>
  
		</form>

	</div>
		
	
</body>

</html>