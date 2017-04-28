package com.onlinejspcompiler.servlets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JSPTestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println(request.getParameter("jspBody"));
		String jspBody = request.getParameter("jspBody");
		// Set response content type
		//response.setContentType("text/html");
		try {
			File file = new File(getServletContext().getRealPath("/")+"/test.jsp");

			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jspBody);
			fileWriter.flush();
			fileWriter.close();
			System.out.println(file.getAbsolutePath());
			System.out.println(getServletContext().getRealPath("/"));
			System.out.println(getServletContext().getContextPath());
			System.out.println(request.getContextPath());
			//request.getRequestDispatcher("test.jsp").forward(request, response);
			String nextJSP = "/index.jsp"; 
			response.setHeader("includeJSP", "true");
			response.setHeader("jspBody", jspBody);
			request.setAttribute("jspBody", jspBody);
			response.setHeader("path", "/test.jsp");

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP); 
			// dispatcher.include(request, response);
			dispatcher.forward(request,response);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}


}
