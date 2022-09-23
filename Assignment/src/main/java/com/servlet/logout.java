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
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		response.setContentType("text/html");
		HttpSession s=request.getSession();
		String user=(String) s.getAttribute("user");
		RequestDispatcher rd=request.getRequestDispatcher("p1logout.jsp");
		rd.include(request, response);
		empDao ed=new empDao();
		String d=ed.getIn(user);
		p.print(d);
		p.print(user);
		ed.updateEmpOut(d);
		ed.updateIn(d);
		String s1=ed.getout(user);
		ed.updateOut(s1);
		
	}

}
