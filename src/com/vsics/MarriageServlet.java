package com.vsics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
			PrintWriter pw=null;
			pw=res.getWriter();
			res.setContentType("text/html");
			String name=req.getParameter("name");
			String gender=req.getParameter("gender");
			String a=req.getParameter("age");
		int age=Integer.parseInt(a);
			if ("female".equalsIgnoreCase(gender)) {
				if(age>=21) {
					pw.println("<h1>Eligible</h1>");
				}
				else {
					pw.println("<h1>Not Eligible</h1>");
				}
			}
			else {
				if(age>=18) {
					pw.println("<h1>Eligible</h1>");
				}
				else {
					pw.println("<h1>Not Eligible</h1>");
				}
			}
			pw.println("<a href='http://localhost:4162/MarriageProject/index.html'>back</a>");
			pw.close();
	}
}
