package com.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		@SuppressWarnings("deprecation")
		String folder=request.getRealPath("/");
		folder=folder.substring(0,folder.indexOf("."))+"nani\\WebContent\\user\\user.properties";
		System.out.println(folder);
		File f=new File(folder);
		FileInputStream fis=new FileInputStream(f);
		byte[] b=new byte[fis.available()];
		fis.read(b);
		String content=new String(b);
		System.out.println(content);
		String username=request.getParameter("pname");
		String password=request.getParameter("pass");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("paddr");
	
	    if(username.length()!=0&&password.length()!=0&&phone.length()!=0&&email.length()!=0&&address.length()!=0)
	    {
	    	content=content+"\n"+username+"\n"+password+"\n"+phone+"\n"+email+"\n"+address;
	    	FileOutputStream fos=new FileOutputStream(f);
	    	fos.write(content.getBytes());
	    	
	    }  
	}

}
