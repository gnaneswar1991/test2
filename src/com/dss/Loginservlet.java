package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("this is my loginservlet");
		writer.println("<br>");
		writer.println("welcome to servelet");
		writer.println("<br>");		
		// Request Paramaters
		String uname =request.getParameter("uname");
		String upass =request.getParameter("upass");
		
		// Business logics
		if(uname.equals("gnaneswar")&& upass.equals("giddaluri"))
		{
			writer.println("username : "+uname);
			writer.println("<br>");
			writer.println("password : "+upass);
		}
		else{
			writer.println("login fail");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
