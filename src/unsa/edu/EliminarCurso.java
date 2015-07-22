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
public class EliminarCurso extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Curso.class);
		
		String codigo = req.getParameter("codigo");
		q.setFilter("codigo == codigoParam");
		q.declareParameters("String codigoParam");
		
		try{
			List<Curso> curso = (List<Curso>) q.execute(codigo);
			for(Curso c: curso){
				pm.deletePersistent(c);
			}
			
		}catch(Exception e){
			resp.getWriter().print("Ups .. ERROR ELIMINAR DOCENTE");
		}finally{
			 q.closeAll();
		}
	}
}