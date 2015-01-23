 import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class Updatepickup extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
        out.println("<body style='background-color:#E6E6FA;'>");
  
       
        
	    HttpSession session = request.getSession();
        String email= (String)session.getAttribute("email")  ;
       
        
        String idate = request.getParameter("idate");
        String itime = request.getParameter("itime");
         String idate = request.getParameter("iweight")
        
        
        try{
        
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	Connection con=DriverManager.getConnection(  
        	"jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
        	out.println("<table align='center' border='3' height='10%' width='40%'>");
        	

        PreparedStatement ps=con.prepareStatement
                  ("insert into transaction (email,iamount,idate,iweight) values(?,?,?,?) ");

        ps.setString(1, email);
        ps.setString(2, iamount);
        ps.setString(3,idate);
        ps.setString(3,iweight);
       
        int i=ps.executeUpdate();
        
        if(i>0)
        {
        	out.println("<html>");
        	out.println("<body bgcolor= skyblue");
        	 out.println("<tr>");
            out.println("<td>"+"<h1>"+"You are sucessfully updated"+"</h1>"+"</td>");
            out.println("<br />");
            
          
            out.println("</tr>"); 
            out.println("</table>");
            out.println("<center>");
            
            out.println("<h1>"+" Go To Home Page From <a href=http://localhost:8081/postal/top.jsp>here</a>"+"</h1>");
            out.println("</center>");
            out.println("</body></html>");
        }
        
        
        
        }catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }