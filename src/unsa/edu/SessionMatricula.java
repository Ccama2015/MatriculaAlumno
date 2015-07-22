package unsa.edu;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class SessionMatricula extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		 resp.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
	     resp.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
	     resp.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
	     resp.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Alumnos.class);
		PrintWriter out = resp.getWriter();
		String usuario=req.getParameter("usuario");
		String pass=req.getParameter("pass");

		
	try{
			List<Alumnos> alumnos = (List<Alumnos>) q.execute();
			for( Alumnos a : alumnos ) {
		if(a.getCui().equals(usuario)&&a.getDni().equals(pass)){	
			
			HttpSession misesion=req.getSession(true);
			misesion.setAttribute("usuario", usuario);
			misesion.setAttribute("pass", pass);
			Query q1 = pm.newQuery(Curso.class);
			q1.setFilter("semestre == param");
			q1.declareParameters("String param");
			List<Curso> cursos = (List<Curso>) q1.execute(a.getSemestre()); 
			req.setAttribute("lista", cursos);
			RequestDispatcher view=req.getRequestDispatcher("/WEB-INF/jsp/matricula.jsp");
			view.forward(req,resp);
		break;
		  }
			
		 }
	}catch(Exception e){
		out.println("Ups Error");
	}
	}
}