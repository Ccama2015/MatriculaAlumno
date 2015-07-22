package unsa.edu;

import java.io.IOException;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Cerrar extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		
		String action=(req.getPathInfo()!=null?req.getPathInfo():"");
        HttpSession misesion = req.getSession();
        if(action.equals("/out")){
            misesion.invalidate();
            resp.sendRedirect("index.html");
        }else{
        	 misesion.invalidate();
             resp.sendRedirect("index.html");
        	//resp.getWriter().println("error al cerrar");
        }
		
	}
}
