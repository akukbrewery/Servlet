package com.telusko;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//sendRedirect method
		HttpSession session =req.getSession();
		session.setAttribute("k",k);
		res.sendRedirect("sq");  //session
		
	}
}
