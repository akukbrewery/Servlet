package com.telusko;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class SqServlet extends HttpServlet {
	 	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			int k=Integer.parseInt(req.getParameter("k"));
			k=k*k;
	 		PrintWriter out = res.getWriter();
			out.println("Result is "+k);
		}
}
