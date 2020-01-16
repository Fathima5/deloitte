package com.del.second.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.del.second.dao.EmployeeDAO;
import com.del.second.entity.Employee;

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		String message = "";
		Employee e = new Employee();
		EmployeeDAO edao = new EmployeeDAO();
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeCrud.jsp");
		if (submit.equals("Add") || submit.equals("Modify")) {
			e.setName(request.getParameter("ename"));
			e.setSalary(Double.parseDouble(request.getParameter("salary")));
			e.setObj(Date.valueOf(request.getParameter("doj")));
			if (submit.equals("Add")) {
				edao.insertEmployee(e);
				message = message + "Inserted Record";
			} else {
				edao.modifyEmployee(e);
				message = message + " Modified Record";
			}

		} else if (submit.equals("Remove")) {
			if (edao.removeEmployee(e.getEmpid()))
				message = message + " Record Deleted";
			else
				message = " Deletion failed";

		} else if (submit.equals("Show")) {
			e = edao.getEmployee(e.getEmpid());
			request.setAttribute("emp", e);
		}
		out.println("<h1 style='color:red;'>" + message + "</h1>");
		rd.include(request, response);
	}
}