package com.telusko;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	 	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
			Cookie cookies[]=req.getCookies();
			int k=0;
			for(Cookie c:cookies){
				if(c.getName().equals("k"))
					k=Integer.parseInt(c.getValue());
			}
			k=k*k;
	 		PrintWriter out = res.getWriter();
			out.println("Result is "+k);
		}
}
