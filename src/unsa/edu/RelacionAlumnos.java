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
public class RelacionAlumnos extends HttpServlet {
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Alumnos.class);
		List<Alumnos> alumnos = (List<Alumnos>) q.execute();
		req.setAttribute("alumnos", alumnos);
		
		for(Alumnos alu:alumnos){
			System.out.println(alu);
		}
		RequestDispatcher rd = req.getRequestDispatcher("controladorVista?opcion=11");
		rd.forward(req, resp);
		
	}
}