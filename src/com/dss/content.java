package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/content")
public class content extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public content() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("this is my Content Servlet:");
		writer.println("</br>");
		
		// Get Response
		String s = request.getParameter("user");
		
		
		//Business Logics
		try{
			if(s.equals("Gnaneswar")){
				writer.println("USername :"+s);
			}else{
				writer.println("username Dosen't Match : ");
			}
		}catch(Exception e){
			writer.println("servlet Exception is found");
		}
		
	
		
	}

}
