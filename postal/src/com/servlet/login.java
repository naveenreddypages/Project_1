package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.RegistrationBean;
import com.dao.Mydao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("email");  
	    System.out.println(n);
	    String p=request.getParameter("password");  
	    
	    RegistrationBean rb=new RegistrationBean();
	    rb.setEmail(n);
	    rb.setPassword(p);
	    boolean b=Mydao.userlogin(rb);
	    System.out.println(b);
	    if(b)
	    {
	    HttpSession session=request.getSession();  
        session.setAttribute("email",n);  
        response.sendRedirect("top.jsp");
        
    }  
    else{  
        out.print("Sorry username or password error");  
      

	    
	}

}
}
