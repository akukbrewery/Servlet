package com.telusko;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

public class SqServlet extends HttpServlet {
	 	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			HttpSession session=req.getSession();
	 		int k=(int)(session.getAttribute("k"));
			k=k*k;
	 		PrintWriter out = res.getWriter();
			out.println("Result is "+k);
		}
}
