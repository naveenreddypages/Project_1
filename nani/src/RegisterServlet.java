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
		String fname=request.getParameter("fname");
                
		String lname=request.getParameter("lname");
                
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mno=request.getParameter("mno");
		String adloc=request.getParameter("adloc");
		String adrs=request.getParameter("adrs");
	
	    if(fname.length()!=0&&lname.length()!=0&&email.length()!=0&&password.length()!=0&&mno.length()!=0&&adloc.length()!=0&&adrs.length()!=0)
	    {
	    	content=content+"\n"+fname+"\n"+lname+"\n"+email+"\n"+password+"\n"+mno+"\n"+adloc+"\n"+adrs+"\n";
	    	FileOutputStream fos=new FileOutputStream(f);
	    	fos.write(content.getBytes());
	    	
	    }  
	}

}
