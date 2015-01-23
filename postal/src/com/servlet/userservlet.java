package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.orderBean;
import com.dao.Mydao;

/**
 * Servlet implementation class userservlet
 */
@WebServlet("/userservlet")
public class userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userservlet() {
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
		String username=request.getParameter("un");
		String day=request.getParameter("day");
		String month=request.getParameter("mm");
		String year=request.getParameter("yr");
		String dat=day+"-"+month+"-"+year;
		String hours=request.getParameter("hours");
		String mins=request.getParameter("mins");
		String time=hours+" "+mins;
		
		String weight=request.getParameter("weight");
		String status="pending";
		orderBean ob=new orderBean();
		ob.setUsername(username);
		ob.setDat(dat);
		ob.setTime(time);
		ob.setWeight(weight);
         ob.setStatus(status);
		Boolean b=Mydao.validate(ob);
		System.out.println(b);
		  if(b)
		  {
			  response.sendRedirect("sucess.jsp?un="+username);
		  }else
		  {
			 
		  response.sendRedirect("resulterror.jsp?un="+username);
		  }
	
	}

}
