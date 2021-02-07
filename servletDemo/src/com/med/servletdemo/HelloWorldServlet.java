package com.med.servletdemo;
/**
 * JSP is a html file
 * Servlet is a Java class file. Generates all the HTML. More steps to access the web. 
 * Best practice is to use them together. Servlet does the business logic, and the JSP 
 * handles the presentation view MVC.
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step1: set the content type
		response.setContentType("text/html");
		
		//Setp2: get the printWriter
		PrintWriter out = response.getWriter();
		
		//Step3: generate the HTML content
		out.println("<html><body>");
		
		out.println("<h2>Hello World</h2>");
		out.println("<hr>");
		out.println("Time on the server is: " + new java.util.Date());
		
		out.println("</body></html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
