<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Sucess</title>
</head>
<body>
<%
String status="Not Avialable";
Connection c=Application.getconnection(" ");
String sql="select status from admin where username=' "+request.getparameter("user")+" ' ";
system.out.println(sql);
preparedStatement ps=c.prepareStatement(sql);
ResultSet r=ps.excuteQuery();
if(r.next)
{
status=r.getString(1);

}
%>
status :<%status%>
 

</body>
</html>