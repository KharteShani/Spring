package com.sk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.dto.EmployeeDto;
import com.sk.dto.StudentDto;
import com.sk.service.ClgMgmtService;

@WebServlet(value = "/controller", loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	ApplicationContext ctx = null;

	@Override
	public void init() throws ServletException {
		// create IOCcontainer
		ctx = new ClassPathXmlApplicationContext("com/sk/cfgs/applicationContext.xml");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentDto sdto = null;
		EmployeeDto eDto = null;
		ClgMgmtService service = null;
		String result = null;
		String s1 = null;
		RequestDispatcher rd = null;

		// get service class object
		service = ctx.getBean("clgservice", ClgMgmtService.class);
		// read s1 request param value
		s1 = req.getParameter("s1");

		if (s1.equalsIgnoreCase("register student")) {
			// Register Student
			sdto = new StudentDto();
			sdto.setId(Integer.parseInt(req.getParameter("sid")));
			sdto.setName(req.getParameter("sname"));
			sdto.setAddress(req.getParameter("saddress"));
			sdto.setCourse(req.getParameter("scourse"));

			// invoke service method
			result = service.registerStud(sdto);
			// keep the result in Request scope
			req.setAttribute("resultmsg", result);

		} else if (s1.equalsIgnoreCase("Employee Register")) {
			// read form data and store StudentDTO class object
			eDto = new EmployeeDto();
			eDto.setId(Integer.parseInt(req.getParameter("SID")));
			eDto.setName(req.getParameter("SNAME"));
			eDto.setAddress(req.getParameter("SADDRESS"));
			eDto.setQlfy(req.getParameter("qlfy"));
			// invoke service method
			result = service.registerEmpl(eDto);
			// keep the result in Request scope
			req.setAttribute("resultmsg", result);
		}

		// forward to result.jsp
		rd = req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();
	}
}
