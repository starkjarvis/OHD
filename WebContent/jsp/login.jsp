<!--<%@include file="include.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body  background="img/back.jpg"  style="background-size:cover;" >
		<center >
			<br><br><br><br><br>
			<div class="container row"  >
			<br><br><br><br><br>
			<h4><font color="red"><b>${message}</b></font></h4>
			<h4><font color="#006400"><b>${signUp}</b></font></h4>
			<form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">

				<span class="style1" class="sr-only" style="color:white; font-size:18px;"><b>Username</b></span>
				<input class="form-control" style="width:50%;" id="username" placeholder="Username" name="email" /><br>
				<span class="style1" class="sr-only" style="color:white; font-size:18px;"><b>Password</b></span>
				<input style="width:50%;" type="password" class="form-control" placeholder="Password" required width="35%" id="password" name="password"  /><br>
				<input type="submit" value="Login" style="width:20%;" class="btn btn-lg btn-primary btn-block" />
				
			</form:form>
			<br>OR &nbsp; <a href="signup" style="font-size:20px; color:WHITE;">Sign Up</a>
		</div>
		<br><br><br><br><br><br>
        <div class="container text-center">
            <p>Copyright &copy; Rajat Sharma 2016</p>
        </div>
    
		
		</center>
		
	</body>
</html> -->




<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Help Desk</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">Online Help Desk</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                   
                    
                    <li>
                        <a class="page-scroll" href="#contact">Contact</a>
                    </li>
                    
                    <li>
                        <a class="page-scroll" href="#login">Login</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header>
        <div class="header-content">
            <div class="header-content-inner">
                <h1 id="homeHeading">Your Favorite Source of ONline Help</h1>
                <hr>
                <p>Connect with an entire team of web designers and event managers  without the high cost of hiring a full-time staff. Get a custom management plan to meet the individual Event Management and maintenance needs of your event and its supporting infrastructure.</p>
                <a href="#about" class="btn btn-primary btn-xl page-scroll">Find Out More</a>
            </div>
        </div>
    </header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">We've got what you need!</h2>
                    <hr class="light">
                    <p class="text-faded">Just Sign up and Login, fill the the form, mention the events you wish us to manage and our professional will be there to help you. Be in direct contact with Managers and employees. Contact by sending messages or call.</p>
                    <a href="#services" class="page-scroll btn btn-default btn-xl sr-button">Get Started!</a>
                </div>
            </div>
        </div>
    </section>

    

    

    
<br><br><br><br>
    <section id="contact" >
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Let's Get In Touch!</h2>
                    <hr class="primary">
                    <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x sr-contact"></i>
                    <p>123-456-6789</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                    <p><a href="mailto:your-email@your-domain.com">rajat.sharma830@gmail.com</a></p>
                </div>
            </div>
        </div>
        
    </section>
    	 <br><br><br><br>
    <section id="login" >
    <center>
    	<div class="container header-content">
            <div class="row">
            
            <h2 class="section-heading">Login</h2>
                    <hr class="primary">
                
                	<form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">

				<span class="style1" class="sr-only" style="color:white; font-size:18px;"><b>Username</b></span>
				<input class="form-control" style="width:50%;" id="username" placeholder="Username" name="email" /><br>
				<span class="style1" class="sr-only" style="color:white; font-size:18px;"><b>Password</b></span>
				<input style="width:50%;" type="password" class="form-control" placeholder="Password" required width="35%" id="password" name="password"  /><br>
				<input type="submit" value="Login" style="width:20%;" class="btn btn-lg btn-primary btn-block" />
				
			</form:form>
			<br>OR &nbsp; <a href="signup" style="font-size:20px; color:BLACK;">Sign Up</a>
			
                
               </div>
               
         </div>
         </center>
    </section>
<br>
        <div class="container text-center">
            <p>Copyright &copy; Rajat Sharma 2016</p>
        </div>
    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/creative.min.js"></script>

</body>

</html>