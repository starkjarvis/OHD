<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
   	<!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">
  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome <%out.println(session.getAttribute("username")); %></title>
</head>

<jsp:include page="navigationBar.jsp"></jsp:include>
<body background="img/tractor.jpg" style="background-size:cover;">
	<center><h3 style="color:GREEN;">${signUp }</h3>
	<h3 style="color:GREEN;">${signUpU }</h3></center>
	<%System.out.println(session.getAttribute("usertype")); %>
	<center><h3 style="color: RED;">${deleteMessageN}</h3></center>
	<center><h3 style="color: GREEN;">${deleteMessageY}</h3></center>
	
	<center><h3 style="color: RED;">${assignJobsN}</h3></center>
	<center><h3 style="color: GREEN;">${assignJobsY}</h3></center>
	<center><h3 style="color: RED;">${deleteAssignedJobsN}</h3></center>
	<center><h3 style="color: GREEN;">${deleteAssignedJobsY}</h3></center>
	
	<center><h3 style="color: RED;">${circulateNoticeN}</h3></center>
	<center><h3 style="color: GREEN;">${circulateNoticeY}</h3></center>
	
	<center><h3 style="color: RED;">${deleteNoticeN}</h3></center>
	<center><h3 style="color: GREEN;">${deleteNoticeY}</h3></center>
	
	<center><h3 style="color: RED;">${FileUploadedN}</h3></center>
	<center><h3 style="color: GREEN;">${FileUploadedY}</h3></center>
	
	<center><h3 style="color: RED;">${fileDeletedN}</h3></center>
	<center><h3 style="color: GREEN;">${fileDeletedY}</h3></center>
	
	<br><br><br><br><br><br>
	<div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
                        <h3>Updated Website</h3>
                        <p class="text-muted">Our website is updated regularly so they don't break.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i>
                        <h3>Ready to help</h3>
                        <p class="text-muted">Our employees are ready to help 24 hours.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
                        <h3>Up to Date</h3>
                        <p class="text-muted">We update dependencies to keep things fresh.</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-heart text-primary sr-icons"></i>
                        <h3>Work comes first</h3>
                        <p class="text-muted">We assure to complete work before given end date.</p>
                    </div>
                </div>
            </div>
        </div>
        
       
	
	
</body>


</html>