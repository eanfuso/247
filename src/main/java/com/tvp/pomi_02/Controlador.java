package com.tvp.pomi_02;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.tvpublica.controllers.Process;
//import com.tvpublica.controllers.String;

/**
 * Servlet implementation class Controlador
 */
public class Controlador extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	private String ing;
    public void setIng(String ing) {
		this.ing = ing;
	}

	///  private String link;
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
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       String link = request.getParameter("link");
        out.println("Tu pedido fue: " + link);
        //out.println(cmd + link);
        
        String[] cmd = {"ffmpeg", "-stream_loop", " 1","-i","http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv", link, "2>", "C:\\Users\\esteban\\log.log", "&"};
        Ingesta ing = new Ingesta(cmd);
        ing.run();
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

//Strin de prueba: String[] cmd = {"ffmpeg", "-stream_loop", " 1","-i","http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv", ing };
