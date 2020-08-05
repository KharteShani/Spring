package com.cb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cb.service.CBScoreMgmtService;
@WebServlet(value="/controller",loadOnStartup=1)
public class MainControllerServlet extends HttpServlet{
	ApplicationContext ctx=null;
	@Override
	public void init() throws ServletException {
	ctx=new ClassPathXmlApplicationContext("com/sb/cfgs/applicationContext.xml");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		CBScoreMgmtService service=null;
		int mid=0;
		String score=null;
		RequestDispatcher rd=null;
		//get service class object
		service=ctx.getBean("cbService",CBScoreMgmtService.class);
		//get Match id
		mid=Integer.parseInt(req.getParameter("mid"));
		//invoke method
		score=service.getScore(mid);
		//keep score into req scope
		req.setAttribute("scoreBoard", score);
		//forward to result.jsp
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
}
