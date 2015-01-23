package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegistrationBean;
import com.dao.Mydao;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<body style='background-color:#E6E6FA;'>");
        
        String fname1 = request.getParameter("fname");
        System.out.println(fname1);
        String lname1 = request.getParameter("lname");
        String email1 = request.getParameter("email");
        String pass = request.getParameter("password");
       
        String mno1=request.getParameter("mno");
        
        String adloc1=request.getParameter("adloc");
        String adrs1=request.getParameter("adrs");
        RegistrationBean rb=new RegistrationBean();
        rb.setFname(fname1);
        rb.setLname(lname1);
        rb.setEmail(email1);
        rb.setPassword(pass);
        rb.setMno(mno1);
        rb.setAdloc(adloc1);
        rb.setAdrs(adrs1);
        
       Boolean status=Mydao.register(rb);
       System.out.println(status);
       if(status)
       {
    	   out.println("<tr>");
           out.println("<td>"+"<h1>"+"You are sucessfully Registered"+"</h1>"+"</td>");
           out.println("<br />");
           
         
           out.println("</tr>"); 
       }
       out.println("</table>");
       out.println("<center>");
       
       out.println("<h1>"+" Login Here <a href=login.jsp>here</a>"+"</h1>");
       out.println("</center>");
	}

}
