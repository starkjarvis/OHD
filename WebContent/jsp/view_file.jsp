<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>


<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%  
            String id=(request.getParameter("id"));
            
            Blob file = null;
            byte[ ] fileData = null ;

            try
            {    
            	Class.forName("com.mysql.jdbc.Driver");
            	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
            
                String sqlString = "SELECT file FROM files WHERE id = '"+id+"'";
                Statement myStatement = conn.createStatement();
                
                ResultSet rs=myStatement.executeQuery(sqlString);
                
                if (rs.next()) 
                {
                    file = rs.getBlob("file");
                    fileData = file.getBytes(1,(int)file.length());
                } else 
                {
                    out.println("file not found!");
                    return;
                }
                
                response.setContentType("application/jpg");
                response.setHeader("Content-Disposition", "inline");
                response.setContentLength(fileData.length);
                
                OutputStream output = response.getOutputStream();
                output.write(fileData);
                
                output.flush();
                output.close();
                
            } catch (SQLException ex) {Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);} 
        %>

</body>
</html>