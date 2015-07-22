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
public class EliminarProfesor extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Profesor.class);
		
		String DNI = req.getParameter("DNI");
		q.setFilter("DNI == DNIParam");
		q.declareParameters("String DNIParam");
		
		try{
			List<Profesor> profe = (List<Profesor>) q.execute(DNI);
			for(Profesor p: profe){
				resp.getWriter().println(p.toString());
				pm.deletePersistent(p);
			}
			
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR ELIMINAR DOCENTE");
		}finally{
			 q.closeAll();
		}
	}
}