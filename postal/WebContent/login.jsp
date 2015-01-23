<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<head>
    <title>Login</title>
	 <style>
  body {
    background-image: url("image.jpg");
	background-repeat: no-repeat;
	background-size:1400px 850px;
}
  </style>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
	<script>
	function validateEmail()
{
 
   var email = document.f1.email.value;
   atpos = email.indexOf("@");
   dotpos = email.lastIndexOf(".");
   if (atpos < 1 || ( dotpos - atpos < 2 )) 
   {
       alert("Please enter @ in u r  email ID")
       document.f1.email.focus() ;
       return false;
   }
   return( true );
}
function check()
	 {
	  if(document.f1.email.value==""){
   alert("enter email");
   return false;
   }
   if(document.f1.password.value==""){
   alert("enter password");
   return false;
   }
   else {
     var ret = validateEmail();
     if( ret == false )
     {
          return false;
     }
   }
}
</script>
</head>
   
  
 
<form action="login"  method="post" onSubmit="return check()">
<center>
<br>   
<tr>
  <td><b><font color="black"/>Email &nbsp ID</b></td>
  <td><input type="text" name="email" value=""></td>
</tr></br>
<br>
<tr>
<td><b><font color="black"/>Password</b></td>
<td><input type="password" name="password" value=""></td></br>
</tr>
</table>
<br>
<input   type="submit" value="Login" name="submit">
<input type="reset" name=""></br>
</center>
</form>

  </body><br><br><br>
  <a  href="index.html"><font size="3"><b><center>Back</center></b></font></a>
</body>
</html>