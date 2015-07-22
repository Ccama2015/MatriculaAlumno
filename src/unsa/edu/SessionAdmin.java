package unsa.edu;


import java.io.IOException;
import java.io.PrintWriter;
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
public class SessionAdmin extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String usuario=req.getParameter("usuario");
		String pass=req.getParameter("pass");

		resp.setHeader("Cache-Control", "no-cahe");
		resp.setHeader("Cache-Control", "no-store");
		resp.setDateHeader("Expires", 0);
		resp.setHeader("Pragma", "no-cahe");
		
		
		if(usuario.equals("admin")&&pass.equals("1234")){	
			
			HttpSession misesion=req.getSession(true);
			misesion.setAttribute("usuario", usuario);
			misesion.setAttribute("pass", pass);
			
			
			
			RequestDispatcher view=req.getRequestDispatcher("WEB-INF/jsp/index.jsp");
			
			view.forward(req,resp);
		
		}

		else{
			
			resp.sendRedirect("index.html");
		}
	//	Query q = pm.newQuery(Alumno.class);
		//q.setFilter("color == colorParam");
		//q.declareParameters("String colorParam");
		
		//try{
			//List<Alumno> alumno = (List<Alumno>) q.execute("Amarillo");
//			List<Persona> personas = (List<Persona>) q.execute();
		
		/*	for(Alumno p: alumno){
				
			}
		}catch(Exception e){
			
		}finally{
			 q.closeAll();
		}
		*/
		
		
	}
}