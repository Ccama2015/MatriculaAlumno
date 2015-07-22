package unsa.edu;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ControladorVista extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			String opcion=req.getParameter("opcion");
			
			if(opcion.equals("1")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/index.jsp");
				rd.forward(req, resp);
			}
			if(opcion.equals("2")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/registroAlumnos.jsp");
				rd.forward(req, resp);
			}
			if(opcion.equals("3")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/registroCurso.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("4")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/registroProfesor.jsp");
				rd.forward(req, resp);
			}
			if(opcion.equals("5")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/eliminarAlumnos.jsp");
				rd.forward(req, resp);
			}
			if(opcion.equals("6")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/eliminarCurso.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("7")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/eliminarProfesor.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("8")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("9")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("10")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
				rd.forward(req, resp);
			}
		
			if(opcion.equals("11")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/mostrarAlumnos.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("12")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/mostrarCurso.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("13")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/mostrarProfesor.jsp");
				rd.forward(req, resp);
			}
			
			if(opcion.equals("14")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/loginMatricula.jsp");
				rd.forward(req, resp);
			}
		}catch (ServletException e) {
			System.out.println(e.getMessage());
		}
	}

}