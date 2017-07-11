<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Client</title>

<script>
	
	function deleteData(){
		var selectedId = $('input[name=deleteMessage]:checked').val();
		
		document.forms[0].action="editAssignment2?sno="+selectedId;
		document.forms[0].method="POST";
		document.forms[0].submit();
	}
	
</script>

</head>

<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	
	<form method="post" action="editAssignment2" role="form" modelAttribute="AddAssignmentBean" >
	
	
	<div class=container>
	
	
	<center>
	
	<h1 >Edit Assignment</h1>
 	<div class="col-sm-12">
 	
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
      			<th>Query is related to</th>
      			
    			</tr>
  		</thead>
  		<tbody>
  			
  			
    		<tr>
    			 
    			<%ArrayList<String[]> data= (ArrayList<String[]>)request.getAttribute("data");
    			if(data.size()==0)
    			{
    			%>
    				<td align="center" colspan="12"><h3>No Assignments.</h3></td>
    			<%	
    			}
    			else
    			{
    			String s[];
    			int count=0;
    			
    			for(int i=0;i<data.size();i++)
    			{
    				s=data.get(i);
    				int j=0;
    				count++;
    				%>
    				<th><input type="radio" name="deleteMessage" id="deleteMessage<%=s[5]%>" value="<%=s[5]%>"></th>
    				<th scope="row"><%=(i+1)%></th><% 
    				
    				
    				for( j=0;j<(s.length-2);j++)
    				{
    				%>
    				
    					
    	      			<td><%=s[j]%></td>
    	      			
    	      			
    	      			
    	      			
    	      		<%} %>	<td><%=s[6] %></td>
    				
    		
   	 		</tr>
   	 		
   	 		<%} }%>
   	 		
   	 		
  		</tbody>
  		
	</table>
	</div>
	<input type="button" onclick="deleteData()" value="Edit" style="width:20%;" class="btn btn-md btn-primary btn-block" />
	</center>
	</div>
		
	</form>
</body>

</html>