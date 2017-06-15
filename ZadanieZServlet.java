package zz.com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ZadanieZServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String var1 = req.getParameter("var1");
		int a = Integer.parseInt(var1);

		String var2 = req.getParameter("var2");
		int b = Integer.parseInt(var2);
		String var3 = req.getParameter("var3");
		int c = Integer.parseInt(var3);

		double d;
		double z;
		double x1;
		double x2;
		
		
		d = Math.pow(b, 2)-4*a*c;
		z = Math.sqrt(d);
		if(z>0){
			if(b == 0 && a != 0){
				x1 = (-b+z)/(2*a);	
				resp.getWriter().println(x1);
			}
			else if (a == 0){
				x1 = -(c/b);
				resp.getWriter().println(x1);
			}
			else{ 
			x1 = (-b+z)/(2*a);
			x2 = (-b-z)/(2*a);
			resp.getWriter().println(x1);
			resp.getWriter().println(x2);
			}
		}else if(z == 0){
			x1 = z/(2*a);
			resp.getWriter().println(x1);
		}else{
			resp.getWriter().println("Корней нет");
		}

	}
}
