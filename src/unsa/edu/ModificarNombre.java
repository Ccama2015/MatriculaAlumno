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
public class ModificarNombre extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Alumnos.class);
		
		String cui = req.getParameter("cui");
		String dato=req.getParameter("dato");
		String nombre=req.getParameter("nombre");
	
		q.setFilter("cui == cuiParam");
		q.declareParameters("String cuiParam");
		
		try{
			List<Alumnos> alu = (List<Alumnos>) q.execute(cui);

			for(Alumnos p: alu){
				
				
				
				 if(dato.equals("nombre"))
			        {
			            p.setNombre(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("ApellidoPaterno"))
			        {
			            p.setApellidoPaterno(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("ApellidoMaterno"))
			        {
			            p.setApellidoMaterno(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 
				 if(dato.equals("Direccion"))
			        {
			            p.setDireccion(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("Ciudad"))
			        {
			            p.setCiudad(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("Distrito"))
			        {
			            p.setDistrito(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				
				 if(dato.equals("FechaN"))
			        {
			            p.setApellidoMaterno(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("Sexo"))
			        {
			            p.setSexo(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("NombreAp"))
			        {
			            p.setNombreAp(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("DireccionAp"))
			        {
			            p.setDireccionAp(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("DNI"))
			        {
			            p.setDni(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("TelefonoA"))
			        {
			            p.setNumTelefono(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("TelefonoAp"))
			        {
			            p.setTelefonoAp(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarAlumnos.jsp");
						rd.forward(req, resp);
			        }
				 
				
			}
			
			
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR");
		}finally{
			 q.closeAll();
		}
	}
}
