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
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ss = request.getParameter("usr");
		HttpSession hs = request.getSession();
		hs.setAttribute("user", ss);
		hs.setMaxInactiveInterval(25);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Welcome user "+hs.getAttribute("user"));
		pw.println("Session was created at "+new Date());
		pw.println("<a href=DestroyServlet>Click here to logout and invalidate the session</a>");
		
		
	}

}
