<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Newuser.html</title>
	
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
       alert("Please Enter @ In Your Email ID");
       document.f1.email.focus() ;
       return false;
   }
   return( true );
}

function check()
	 {
           if(document.f1.fname.value==""){
 	   alert("Enter First Name ");
 	   return false;
 	   }
           if(document.f1.lname.value==""){
 	   alert("Enter Last Name ");
 	   return false;
 	   }
	  if(document.f1.email.value=="")
	  {
   alert("Enter Email ID");
   return false;
      }
	  else {
     var ret = validateEmail();
     if( ret == false )
     {
          return false;
     }
    

    
   }
    if(document.f1.password.value==""){
    	   alert("Enter Password");
    	   return false;
    	   }
		   
  

   
    
    if(document.f1.mno.value==""){
   alert("Enter Mobile Number");
   return false;
   }
if(document.f1.adrs.value==""){
   alert("Enter Address");
   return false;
   }
   
   
  

}
</script>
  </head>
<body background="image.jpg">
<form action="register" method="post" name=f1 onSubmit="return check()">
<pre>
<center><b><font size="5">WELCOME TO NEW USER</font></b></center>
  <table  width="10" align="center"> 
  <tr>
  <td><b>First Name</b></td>
<td><input type="text" name="fname"></td>
  </tr>
<tr>
  <td><b>Last Name</b></td>
<td><input type="text" name="lname"></td>
  </tr>
  <tr>
  <td><b>EmailId</b></td>
<td><input type="text" name="email" title=" EX:naveen@gmail.com"></td>
  </tr>
  
 <tr>
  <td><b>Password</b></td>
  <td><input type="password" name="password" title=" EX:pass@123"></td>
  </tr>
   
 
  <tr>
  <td><b>Mobile number </b></td>
  <td><input type="text" name="mno"title=" EX:08121856567" ></td>
  </tr>
<tr>
<td><b>Address</b></td>
<td> <select name="adloc">> 
<option  selected="selected">Select...</option>
<option  value="home">Home</option>
 <option value="office">Office</option>
</td>
</tr>
</select>

<tr>
  <td><b>            </b></td>
  <td><input type="text" name="adrs"title=" EX:2-24-b,Premnagar,Hyderabad" ></td>
  </tr>

  
  </table>
  <center>
  &nbsp  &nbsp  &nbsp  &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp  
  <input type="submit" value="Submit" name="submit">
  <br />
  <input type="reset" value="ReSet"></center>
  </pre>
   <br><br>
  <a  href="index.html"><font size="3"><b><center>Back</center></b></font></a>
  </form>

</body>
</html>