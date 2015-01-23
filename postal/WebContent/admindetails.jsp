<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getParameter("un").equals("admin")&&request.getParameter("pw").equals("admin"))
{ %>
<% 
			
		Connection conn=myconnection.getConnection();
PreparedStatement ps=conn.prepareStatement("SELECT * from orders");
ResultSet rs=ps.executeQuery();
ResultSetMetaData data=rs.getMetaData();
%>
<table>
<tr>
<td colspan="6" align="left">Request</td></tr>
<tr>
<%
for(int i=1;i<=data.getColumnCount();i++)
{%>
<td><%=
	data.getColumnName(i)%>
</td>
<%
}
%>
</tr><%
 while(rs.next())
		    	{
		    	String user=rs.getString(1);
		    	String date=rs.getString(2);
		    	String time=rs.getString(3);
		    	String weight=rs.getString(4);
		    	String stat=rs.getString(5);
		    	if(stat.endsWith("pending"))
		    	{
		    		%>
		    		
		    		<tr><td>
		    		<%=user %></td>
		    		<td><%=date %></td>
		    		<td>
		    		<%=time %></td>
		    		<td><%=weight %></td>
		    		<td>
		    		<%=stat %></td>
		    	}
		    	<td><a=href="orderAccept?un=<%=user%>">Accept</a></td></tr>
		    	<%
		    	}
		    	else
		    	{%>
		    	<tr>
		    	</td><td><%=user %>
		    	</td>
		    	<td><%=date%></td>
		    	<td><%=time%></td>
		    	<td><%=weight%></td>
		    	<td><%=Accepted %>
		    	</td></tr>
		    	<%}%>
		    	<%} %>
</table>
<%}} else{ %>
<p> ERROR</p><% } %>

</body>
</html>