package unsa.edu;

import java.io.IOException;


import java.util.Arrays;
import java.util.Map;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RegistroAlumnos extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		      
		PersistenceManager pm = PMF.get().getPersistenceManager();
		String cui = req.getParameter("cui");
		String nombre = req.getParameter("nombre");
		String apellidoPaterno = req.getParameter("apellidoPaterno");
		String apellidoMaterno = req.getParameter("apellidoMaterno");
		String dni = req.getParameter("dni");
		String direccion = req.getParameter("direccion");
		String ciudad = req.getParameter("ciudad");
		String distrito = req.getParameter("distrito");
		
		String nacimiento = req.getParameter("nacimiento");
		String numTelefono=req.getParameter("numTelefono");
		String sexo = req.getParameter("sexo");
		
		String nombreAp = req.getParameter("nombreAp");
		String direccionAp = req.getParameter("direccionAp");
		String telefonoAp = req.getParameter("telefonoAp");
		String semestre=req.getParameter("semestre");
	
		
		try {
			Alumnos alu = new Alumnos( cui, nombre,  apellidoPaterno,
					                   apellidoMaterno,  nombreAp,  direccionAp,
					                   numTelefono,  dni,direccion, ciudad,
				                       distrito,  nacimiento,telefonoAp,  sexo,semestre);
	
			
			pm.makePersistent(alu);
	
		} catch (Exception e) {
			resp.getWriter().print("ERROR");
		} finally {
			pm.close();
		}
	}
}
