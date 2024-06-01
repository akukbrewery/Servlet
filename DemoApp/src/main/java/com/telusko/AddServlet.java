package com.telusko;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		logic(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		logic(req,res);
	}
	public void logic(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		Cookie cookie =new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
