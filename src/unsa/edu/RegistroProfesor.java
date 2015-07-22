package unsa.edu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistroProfesor extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();

		String DNI = req.getParameter("DNI");
		String Nombre = req.getParameter("Nombre");
		String ApellidoPaterno = req.getParameter("ApellidoPaterno");
		String ApellidoMaterno = req.getParameter("ApellidoMaterno");
		String FechaNacimiento = req.getParameter("FechaNacimiento");
		String Sexo = req.getParameter("Sexo");
		String Direccion = req.getParameter("Direccion");
		String Departamento = req.getParameter("Departamento");
		String Provincia = req.getParameter("Provincia");
		String Distrito = req.getParameter("Distrito");
		String Telefono = req.getParameter("Telefono");
		String GradoAcademico = req.getParameter("GradoAcademico");
		String DepartamentoAcademico = req.getParameter("DepartamentoAcademico");
		
		try {
			System.out.println("yyy");
			Profesor profe = new Profesor(DNI,  Nombre, ApellidoPaterno,  ApellidoMaterno, FechaNacimiento, Sexo, 
					 Direccion, Departamento, Provincia, Distrito,  Telefono,
					 GradoAcademico,  DepartamentoAcademico);
			System.out.println("yyy");
			pm.makePersistent(profe);
			
			
			resp.getWriter().print(" DOCENTE GUARDADO\n" + profe.toString());
		} catch (Exception e) {
			resp.getWriter().print("ERROR DE REGISTRO DOCENTE");
		} finally {
			pm.close();
		}
	}
}