package com.tvp.pomi_02;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: Acà de nuevo!!! ").append(request.getContextPath());
	
		//response.getWriter().append(request.getAttribute("link"));
		//PrintWriter print = new PrintWriter((Writer) request.getAttribute("link"));
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.println("Tu pedido fue: " + (request.getParameter("link")));
        
        
//        out.println("<h1>Hora Actual: ");
//        out.println(System.currentTimeMillis());
//        out.println("</h1>");
        response.setStatus(200);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
