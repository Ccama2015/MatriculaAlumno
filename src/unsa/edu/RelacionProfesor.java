package unsa.edu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RelacionProfesor extends HttpServlet {
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Profesor.class);
		List<Profesor> profe = (List<Profesor>) q.execute();
		req.setAttribute("profe", profe);
		
		for(Profesor pr:profe){
			System.out.println(pr);
		}
		RequestDispatcher rd = req.getRequestDispatcher("controladorVista?opcion=13");
		rd.forward(req, resp);
		
	}
}