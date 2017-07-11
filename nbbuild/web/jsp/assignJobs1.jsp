<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.ArrayList, java.sql.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Client</title>

<script>
	
	function deleteData(){
		var selectedId = $('input[name=deleteMessage]:checked').val();
		var email=$('#email'+selectedId).val();
		
		document.forms[0].action="assignJobs2?sno="+selectedId+"&email="+email;
		document.forms[0].method="POST";
		document.forms[0].submit();
		
		
	}
	
</script>

</head>

<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	
	<form method="post" action="assignJobs2" role="form" modelAttribute="AssignToBean" target="_self">
	
	
	<div class=container>
	
	
	<center>
	
	<h1 >Reply to a query</h1>
 	<div class="col-sm-15">
 	
 	
 	
	<table class="table table-hover">
  		<thead class="thead-inverse">
   			 <tr>
   			 	<th></th>
      			<th>#</th>
      			<th>Full Name</th>
      			<th>Email</th>
      			<th>End Date</th>
      			<th>Query Description</th>
      			<th>Start Date</th>
      			<th>Query related to</th>
      			<th>Reply</th>
      			
    			</tr>
  		</thead>
  		<tbody>
  			
  			
    		<tr>
    			 
    			<%ArrayList<String[]> data= (ArrayList<String[]>)request.getAttribute("data");
    			
    			if(data.size()==0)
    			{
    			%>
    				<td align="center" colspan="12"><h3>No Jobs.</h3></td>
    			<%	
    			}
    			else
    			{
    			String s[];
    			int count=0;
    			
    			for(int i=0;i<data.size();i++)
    			{
                                
    				s=data.get(i);
    				count++;
    				%>
    				<th><input type="radio" name="deleteMessage" id="deleteMessage<%=s[5]%>" value="<%=s[5]%>"></th>
    				<th scope="row"><%=(i+1)%></th><% 
    				
    				
    				for(int j=0;j<(s.length-1);j++)
    				{
    				%>
    				
    					
    	      			<td><%=s[j]%></td>
    	      			
    	      			
    	      			
    	      		<%} %>	
                        
    	      		<td><textarea class="form-control noresize"  name="email<%=s[5]%>" id="email<%=s[5]%>" cols="25" rows="3" placeholder="reply.."></textarea></td>
    				
    		
   	 		</tr>
   	 		
   	 		<%} }%>
   	 		
   	 		
  		</tbody>
  		
	</table>
	</div>
	
	
	<input type="button" onclick="deleteData()" value="Reply to a selected query" style="width:20%;" class="btn btn-md btn-primary btn-block" />
	<br><center><a href="admin" style="font-size:20px; color:GREEN;"><b>Go Back</b></a></center>
	</center>
	</div>
		
	</form>
</body>

</html>