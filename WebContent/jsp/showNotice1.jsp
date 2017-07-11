<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>



</head>

<body background="img/blue.jpg" style="background-size:cover;">
	<jsp:include page="navigationBar.jsp"></jsp:include>
	
	
	
	<div class=container>
	
	
	<center>
	
	<h1 >Notices</h1>
 	<div class="col-sm-12">
 	
 	
 	
	<table class="table table-hover">
  		<thead class="thead-inverse">
   			 <tr>
   			 	
      			<th>#</th>
      			<th>Notice</th>
      			<th>From</th>
      			<th>Date</th>
      			<th>Time</th>
      			
    			</tr>
  		</thead>
  		<tbody>
  			
  			
    		<tr>
    			 
    			<%ArrayList<String[]> data= (ArrayList<String[]>)request.getAttribute("data");
    			if(data.size()==0)
    			{
    			%>
    				<td align="center" colspan="12"><h3>No Notices.</h3></td>
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
    				
    				<th scope="row"><%=(i+1)%></th><% 
    				
    				
    				for( j=1;j<(s.length);j++)
    				{
    				%>
    				
    					
    	      			<td><%=s[j]%></td>
    	      			
    	      			
    	      			
    	      		<%} %>
    				
    		
   	 		</tr>
   	 		
   	 		<%} }%>
   	 		
   	 		
  		</tbody>
  		
	</table>
	</div>
	
	</center>
	</div>
		
	</form>
</body>

</html>