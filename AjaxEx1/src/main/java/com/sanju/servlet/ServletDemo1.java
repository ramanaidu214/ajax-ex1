package com.sanju.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sanju.domain.Employee;

public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletDemo1() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("sanju");
		
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("ram");
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		
		String employeeJsonString = new Gson().toJson(list);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(employeeJsonString);
		out.flush();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
PrintWriter out = response.getWriter();
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("sanjay");
		
		Employee emp2=new Employee();
		emp2.setEmpId(102);
		emp2.setEmpName("venkat");
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		
		String employeeJsonString = new Gson().toJson(list);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(employeeJsonString);
		out.flush();

	}

}