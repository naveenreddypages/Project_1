package com.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
try {
	@SuppressWarnings("deprecation")
	String folder=request.getRealPath("/");
	folder=folder.substring(0,folder.indexOf("."))+"nani\\WebContent\\user\\user.properties";
	FileInputStream fis=new FileInputStream(new File(folder));
	Properties p=new Properties();
	p.load(fis);
	String username=request.getParameter("pname");
	String password=request.getParameter("pass");
	
	
	if(p.containsKey(username)&&p.containsValue(password))
	{

}
	
	
} catch (Exception e) {
	// TODO: handle exception
}
	}

}
