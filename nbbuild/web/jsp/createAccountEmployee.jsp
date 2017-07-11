<head>
	
</head>

<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
		
	
		<center><h4 style="color:RED"; font-size:20px;">${signUpU}</h4></center>
		<div class="container">
            <form method="post" action="createAccountEmployee" modelAttribute="SignUpBean" class="form-horizontal" role="form" id="SignUp" onsubmit="if(document.getElementById('agree').checked) { return true; } else { alert('Please indicate that you have read and agree to the Terms and Conditions and Privacy Policy'); return false; }">
            	
                <center><h2><b>Registration Form</b></h2></center>
                <br><br>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Full Name</label>
                    <div class="col-sm-6">
                        <input type="text" name="fullName" placeholder="Full Name" class="form-control" autofocus>
                        <span class="help-block">Last Name, First Name, Example: Harry Smith</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-6">
                        <input type="email" name="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-6">
                        <input type="password" name="password" placeholder="Password" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                    <div class="col-sm-6">
                        <input type="date" name="dateOfBirth" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="usertype" class="col-sm-3 control-label">Usertype</label>
                    <div class="col-sm-6">
                        <select name="usertype" class="form-control">
                            <option>Select</option>
                            
                            <option>Faculty</option>
                            <option>Student</option>
                            <option>Staff</option>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-4">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Male">Male
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="Other">Other
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
               
                <div class="form-group">
                    <div class="col-sm-6 col-sm-offset-3">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" id="agree">I accept <a target="_new" href="termsandconditions">Terms and Conditions</a>
                            </label>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-6 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                       	OR &nbsp; <a href="employee1" style="font-size:20px; color:BLACK;"><b>Go Back</b></a>
                    </div>
                </div>
                
            </form> <!-- /form -->
        </div> <!-- ./container -->
		
	
	
	
	
</body>
