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
public class ModificarCurso extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Curso.class);
		
		String codigo = req.getParameter("codigo");
		String dato=req.getParameter("dato");
		String nombre=req.getParameter("nombre");
		
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		try{
			List<Curso> curso = (List<Curso>) q.execute(codigo);
			
			for(Curso p: curso){
			
				 if(dato.equals("nomcurso"))
			        {
			            p.setNomcurso(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("creditos"))
			        {
					 int creditos= Integer.parseInt(nombre);
			            p.setCreditos(creditos);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("codigo"))
			        {
			            p.setCodigo(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
						rd.forward(req, resp);
			        }
				 
				
				 if(dato.equals("deptacademico"))
			        {
			            p.setDeptacademico(nombre);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
						rd.forward(req, resp);
			        }
				 if(dato.equals("horas"))
			        {
					 int horas= Integer.parseInt(nombre);
			            p.setHoras(horas);
			            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/modificarCurso.jsp");
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