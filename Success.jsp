<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="main.*,java.sql.*,java.util.*" %>
    <%

String name=(String)session.getAttribute("name");
Connection con=ConnectionManager.getConnection();

//PreparedStatement stmt = null;
PreparedStatement stmt=null;
List<UserStockDaoImpl> holdingsList = new ArrayList<UserStockDaoImpl>();

String display="select * from T_COMITID_COMP where USER_NAME=?";

		ResultSet resultset=null;	
		try
		{
			
			stmt=con.prepareStatement(display);
			stmt.setString(1,name);
			resultset=stmt.executeQuery();
			while(resultset.next())
			{
				UserStockDaoImpl b=new UserStockDaoImpl();
				b.setCOMP_NAME(resultset.getString(1));
				b.setUPDATE_TIMESTAMP(resultset.getString(2));
				b.setUSER_NAME(resultset.getString(3));
				holdingsList.add(b);
				
				
				
			}
			
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}






%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
below are the companies selected by <%= holdingsList.get(0).getUSER_NAME() %> at <%= holdingsList.get(0).getUPDATE_TIMESTAMP() %>
<ol start=1>
<% if(holdingsList!=null)
{for(int i=0;i<holdingsList.size();i++){ %>

<li><%=holdingsList.get(i).getCOMP_NAME() %>

<%} }%>
</ol>
</body>
</html>