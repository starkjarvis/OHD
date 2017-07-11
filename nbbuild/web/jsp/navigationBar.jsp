
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<%@include file="include.jsp"%>
<!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">
</head>
<body>
<%
if(session.getAttribute("usertype").equals("client") || session.getAttribute("usertype").equals("staff") || session.getAttribute("usertype").equals("student") || session.getAttribute("usertype").equals("faculty") )
{
	
%>


<nav class="navbar navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="client1"><img  alt="Brand" src="img/logo.jpg" style="height: 33px;width: 100px;float:left;" /></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li ><a href="viewTableClient">Show Messages <span class="sr-only">(current)</span></a></li>
        <li><a href="sendMessageClient">Compose Message</a></li>
        <li><a href="showSentMessageClient">Sent Messages</a></li>
        
        <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">Activities<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="addAssignmentClient">Add a query</a></li>
                  
                  <li><a href="showAssignmentClient">Show all Queries</a></li>
                  <li><a href="showAssignedJobs">Replies to my queries</a></li>
                  <li><a href="showNotice1">Show Notice</a></li>
                  <li><a href="uploadFile">Share files</a></li>
                  
                  
                </ul>
              </li>
  
       
      </ul>
       <form class="navbar-form navbar-left" action="http://www.google.com/search" method="get" target="_blank">
        <div class="form-group">
          <input type="text" name="q" class="form-control" placeholder="Search on Google">
        </div>
        <input type="submit" class="btn btn-default" value="Search">
      </form>
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="changePassword">Change Password</a></li>
        <li><a href="logout">Logout</a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<%
}
else if(session.getAttribute("usertype").equals("admin"))
{
	

%>

<nav class="navbar navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="admin"><img  alt="Brand" src="img/logo.jpg" style="height: 33px;width: 100px;float:left;" /></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li ><a href="viewTableAdmin">Show Messages <span class="sr-only">(current)</span></a></li>
        <li><a href="sendMessageAdmin">Compose Message</a></li>
        <li><a href="showSentMessage">Sent Messages</a></li>
       <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">Activities<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="createAccountAdmin">Create an account</a></li>
                  <li><a href="showAssignmentAdmin">Show all queries</a></li>
                  
                  <li><a href="assignJobs">Reply to a query</a></li>
                  
                  <li><a href="showRegistrationTable">Registration Table</a></li>
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Notice</li>
                  <li><a href="circulateNotice">Circulate Notice</a></li>
                  <li><a href="deleteNotice">Delete Notice</a></li>
                  <li><a href="uploadFile">Share files</a></li>
                  
                </ul>
              </li>
              
                   
      </ul>
      
      <form class="navbar-form navbar-left" action="http://www.google.com/search" method="get" target="_blank">
        <div class="form-group">
          <input type="text" name="q" class="form-control" placeholder="Search on Google">
        </div>
        <input type="submit" class="btn btn-default" value="Search">
      </form>
      
      <ul class="nav navbar-nav navbar-right">
        <li><a href="changePassword">Change Password</a></li>
        <li><a href="logout">Logout</a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>


<%
}
else if(session.getAttribute("usertype").equals("employee"))
{
	%>
	
	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="employee1"><img  alt="Brand" src="img/logo.jpg" style="height: 33px;width: 100px;float:left;" /></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li ><a href="viewTableEmployee">Show Messages <span class="sr-only">(current)</span></a></li>
        <li><a href="sendMessageEmployee">Compose Message</a></li>
        <li><a href="showSentMessageEmployee">Sent Messages</a></li>
 
       <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">Activities<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="createAccountEmployee">Create an account</a></li>
                  <li><a href="showAssignmentEmployee1">Show assignments</a></li>
                  <li><a href="showNotice1">Show Notice</a></li>
                  <li><a href="uploadFile">Share files</a></li>
                  
                </ul>
              </li>
      </ul>
      <form class="navbar-form navbar-left" action="http://www.google.com/search" method="get" target="_blank">
        <div class="form-group">
          <input type="text" name="q" class="form-control" placeholder="Search on Google">
        </div>
        <input type="submit" class="btn btn-default" value="Search">
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="changePassword">Change Password</a></li>
        <li><a href="logout">Logout</a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
	
	
	<%
}

%>





</body>