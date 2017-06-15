package ft.com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FortServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		Random rnd = new Random();
		int[][] a = new int[5][8];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				a[x][y] = rnd.nextInt(199)-99;
				}
			}
		resp.getWriter().println("<br>");
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				resp.getWriter().println(a[x][y] + " ");
			}
			resp.getWriter().println("<br>");
				}
		
		int max = a[0][0];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				if(max<a[x][y]){
					max = a[x][y];
				}
				
			}
			}
		resp.getWriter().println("<br> Max element of array=" + max);
	}
}
