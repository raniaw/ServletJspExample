package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletJspExample
 */
public class ServletJspExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletJspExample() {
        super();	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("firstname") == null || request.getParameter("lastname") == null){
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", lastName);
		
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

}
