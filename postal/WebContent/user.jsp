<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <style>
  body {
    background-image: url("image.jpg");
	background-repeat: no-repeat;
	background-size:1400px 850px;
}
  </style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body bgcolor="">
<form action="userservlet" method="post">
<center>
Username:
<input type="text" name="un"><br>
SELECT PICKUP DATE
<select name="day" id=""dd>
<option>DD</option>
<%for(int i=1;i<31;i++) {%>
<option value="<%=i %>"><%=i %>
</option><%} %>
</select>
<select name="mm" id="mm">
<option>MM</option>
<%for(int i=1;i<13;i++) {%>
<option value="<%=i %>"><%=i %>
</option><%} %>
</select>
<select name="yr" id="yr">
<option> YEAR</option>
<%for(int i=2000;i<2020;i++) {%>
<option value="<%=i %>"><%=i %>
</option><%} %>
</select>
<br>
SELECT PICKUP TIME
<select name="hours" id="hours">
<option> Hours</option>
<%for(int i=1;i<31;i++) {%>
<option value="<%=i %>"><%=i %>
</option><%} %>
</select>
<select name="mins" id="mins">
<option>MINs</option>
<%for(int i=1;i<13;i++) {%>
<option value="<%=i %>"><%=i %>
</option><%} %>
</select><br>
Approx Weight:<input type="text" name="weight">
<br>
<input type="submit" value="submit">

</center>
</form>
</body>
</html>