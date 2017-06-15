package tr.com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TrueServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html;charset=UTF-8"); 
		String var1 = req.getParameter("var1"); 
		int i1 = Integer.parseInt(var1); 

		String var2 = req.getParameter("var2"); 
		int i2 = Integer.parseInt(var2); 
		// resp.getWriter().println("Были переданы следующие значения:"+ i1 + i2); 

		int m1 = Math.abs(10 - i1); 
		int m2 = Math.abs(10 - i2); 
		if (m1<m2){ 
		resp.getWriter().println(i1); 
		} 
		else {if(m2==m1) resp.getWriter().println("числа одинакого близко"); 
		else {resp.getWriter().println(i2); 

		} 
		}

	}
}
