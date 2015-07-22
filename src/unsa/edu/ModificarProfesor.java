package unsa.edu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ModificarProfesor extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Profesor.class);
		
		String DNI = req.getParameter("DNI");
		String dato=req.getParameter("dato");
		String nombre=req.getParameter("nombre");
	
		q.setFilter("DNI == DNIParam");
		q.declareParameters("String DNIParam");
		
		try{
			List<Profesor> profe = (List<Profesor>) q.execute(DNI);
			for(Profesor p: profe){
			
				
				 
				 
				 if(dato.equals("ApellidoPaterno"))
			        {p.setApellidoPaterno(nombre); 
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 if(dato.equals("Nombre"))
			        {p.setNombre(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("ApellidoMaterno"))
			        {p.setApellidoMaterno(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("FechaNacimiento"))
			        { p.setFechaNacimiento(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				
				 if(dato.equals("Sexo"))
			        {p.setSexo(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("Direccion"))
			        { p.setDireccion(nombre); 
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				
				 if(dato.equals("Departamento"))
			        {  p.setDepartamento(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("Provincia"))
			        {p.setProvincia(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("Distrito"))
			        {p.setDistrito(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("Telefono"))
			        { p.setTelefono(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("GradoAcademico"))
			        { p.setGradoAcademico(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
				 
				 if(dato.equals("DepartamentoAcademico"))
			        { p.setDepartamentoAcademico(nombre);
			        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarProfesor.jsp");
					rd.forward(req, resp);}
			}
			
			
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR MODIFICAR DOCENTE");
		}finally{
			 q.closeAll();
		}
	}
}