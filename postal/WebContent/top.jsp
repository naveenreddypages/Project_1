<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>India Post</title>
<style>
  body {
    background-image: url("image.jpg");
	background-repeat: no-repeat;
	background-size:1400px 850px;
}
  </style>
</head>
 <body><h3> <center>Welcome <font color="yellow"> <%= (String)session.getAttribute("email")   %>   </center></h3>
<table> 
<tr> 
     <td><img src="2.png" width=200 height=100></td> 
     <td colspan=4><align="center">
	      <font color = "black" size=10>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp India Post  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
     </font></td> 
     <td><img src = "5.png" width=200 height =100></td>
</tr> 

<tr> 
<td width=200></td> 
<td width=200><a href="user.jsp" target="_self"><font color="black" size="5"><b>Update Pickup</td> 

<td width=200><a href="LogoutServlet"><font color="red" size="5"><b>Logout</font></a></td>

</tr> 
</table>

</html>