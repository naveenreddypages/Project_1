import java.io.IOException;  
import java.io.PrintWriter;  
  

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
  
  
public class LoginServlet extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("email");  
    String p=request.getParameter("password");  
          
    if(LoginDao.validate(n, p)){  
    	HttpSession session=request.getSession();  
        session.setAttribute("email",n);  
        RequestDispatcher rd=request.getRequestDispatcher("top.html");  
        rd.forward(request,response);  
    }  
    else{  
        out.print("Sorry username or password error");  
        out.println(" Login from <a href=http://localhost:8081/PBM/userlogin.html>here</a>");
        //RequestDispatcher rd=request.getRequestDispatcher("fail.html");  
        //rd.include(request,response);  
    }  
          
    out.close();  
    }  
}  