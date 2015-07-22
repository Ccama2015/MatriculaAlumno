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
public class RelacionCurso extends HttpServlet {
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Curso.class);
		List<Curso> curso = (List<Curso>) q.execute();
		req.setAttribute("curso", curso);
		for(Curso c:curso){
			System.out.println(c);
		}
		RequestDispatcher rd = req.getRequestDispatcher("controladorVista?opcion=12");
		rd.forward(req, resp);
		
	}
} 
