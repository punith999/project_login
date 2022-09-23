package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.empDao;
import com.javabeans.Employee;

/**
 * Servlet implementation class view
 */
@WebServlet("/view")
public class view extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		response.setContentType("text/html");
		HttpSession hs=request.getSession();
		String user=(String)hs.getAttribute("user");
		empDao ed=new empDao();
		RequestDispatcher rd=request.getRequestDispatcher("p1success.jsp");
		rd.include(request, response);
		List<Employee> e=new ArrayList<>();
		e.addAll(ed.getUsers(user));
		p.println("<table cellspacing=0 width=50px border=8px>");
		p.println("<tr>");
		p.println("<td>empname</td>");
		p.println("<td>login</td>");
		p.println("<td>logout</td>");
		p.println("</tr>");
		for(Employee e1:e) {
			p.println("<tr>");
			p.println("<td>"+e1.getEmpname()+"</td>");
			p.println("<td>"+e1.getLogin()+"</td>");
			p.println("<td>"+e1.getLogout()+"</td>");
			p.println("</tr>");
		}
		p.println("</table>");
	}

}
