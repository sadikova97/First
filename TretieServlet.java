package tr.com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TretieServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		
		Random rnd = new Random();
		int[][] a = new int[8][5];
		
		for(int x = 0;x < a.length;x++){
			for(int y = 0;y < a[x].length;y++){
				a[x][y] = rnd.nextInt(89)+10;
				}
			}
		resp.getWriter().println("<br>");

	for(int x = 0;x < a.length;x++){
		for(int y = 0;y < a[x].length;y++){
			resp.getWriter().print(a[x][y] + " ");
		}
		resp.getWriter().println("<br>");
			}
	
	}
}
