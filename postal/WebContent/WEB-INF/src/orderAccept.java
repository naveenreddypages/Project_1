 import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class orderAccept extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
        
       
        
        
        try{
        String sql="update admin set status='Accept' where username='"+request.getParameter("user")+ " ' ";

        	


        PreparedStatement ps=ApplicationConnection.getConnection("");
int result=ps.excuteupdate();
System.out.println("Result-"+result);
response.sendRedirect("user.jsp?un=admin & pw=admin");

        
        }
        
        
        
        catch(Exception se)
        {
           
        }
	
      }
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
}
  }