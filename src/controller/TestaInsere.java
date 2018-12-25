package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Paciente;

/**
 * Servlet implementation class TestaInsere
 */
@WebServlet("/TestaInsere")
public class TestaInsere extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Paciente paciente = new Paciente();
		
		System.out.println(request.getParameter("estado_saude"));
		
		RequestDispatcher rd = request
				.getRequestDispatcher("/contadoAdicionado.jsp");
				rd.forward(request,response);
		
	}

}
