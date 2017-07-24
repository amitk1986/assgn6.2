package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DestroyServlet
 */
@WebServlet("/DestroyServlet")
public class DestroyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		hs.invalidate();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Successfully logged out");
		pw.println("Session was destroyed at "+new Date());
		pw.println("<a href=SessionCreator.html>Click here to login</a>");
	}

}
