import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class RegisterServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<body style='background-color:#E6E6FA;'>");
        
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
       
        String mno=request.getParameter("mno");
        String adloc=request.getParameter("adloc");
        String adrs=request.getParameter("adrs");
        try{
        
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
        	out.println("<table align='center' border='3' height='10%' width='40%'>");
        PreparedStatement ps=con.prepareStatement
                  ("INSERT INTO userd (fname,lname,email,password,mno,adloc,adrs) VALUES (?,?,?,?,?,?)");

        ps.setString(1, fname);
ps.setString(2, lname);
        ps.setString(3, email);
        ps.setString(4, password);
        ps.setString(5, mno);
        
        ps.setString(6,adloc);
         ps.setString(7,adrs);
        int i=ps.executeUpdate();
        
        if(i>0)
        {
        	 out.println("<tr>");
             out.println("<td>"+"<h1>"+"You are sucessfully Registered"+"</h1>"+"</td>");
             out.println("<br />");
             
           
             out.println("</tr>");        
         }
         out.println("</table>");
         out.println("<center>");
         
         out.println("<h1>"+" Login Here <a href=http://localhost:8081/indiapostproject/userlogin.html>here</a>"+"</h1>");
         out.println("</center>");
         
        
        }catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }