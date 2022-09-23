package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.empDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		response.setContentType("text/html");
		HttpSession se= request.getSession();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		se.setAttribute("user", user);
		se.setAttribute("pass", pass);
	
//		rd.forward(req, resp);
//		p.println(user+pass);
		empDao ed=new empDao ();
		String pass2= ed.checkUser(user);
		if (pass.equals(pass2)){
			RequestDispatcher rd= request.getRequestDispatcher("p1success.jsp");
			rd.include(request, response);
			ed.updateEmpIn(user);
			LocalDateTime l= LocalDateTime.now();
			ed.insert2(user);
			
						
			}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("p1Login.jsp");
			rd.include(request, response);
			p.println("<p>Invalid user or password.Try login again.");
			p.println("<p>Not an existing user?<span><a href=\"http://localhost:8080/Project1/p1Registration.jsp\" style=\"text-decoration:none;color:green;\"> Sign Up</a></span><p> ");
			

		}
	
	}

}
