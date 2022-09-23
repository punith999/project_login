package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.empDao;
import com.javabeans.Employee;


/**
 * Servlet implementation class pppp
 */
@WebServlet("/pppp")
public class pppp extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empname=request.getParameter("empname");
		String password=request.getParameter("password");
		String empEmail=request.getParameter("empEmail");
		Employee r=new Employee ();
		r.setEmpname(empname);
		r.setPassword(password);
		r.setEmpEmail(empEmail);
		empDao rg=new empDao();
	    boolean status=rg.Insert(r);
	    PrintWriter p= response.getWriter();
	    p.println(empname+password+empEmail);
	  //System.out.println(status);
		//rg.deleteRegistration(user);
		
	}

}
