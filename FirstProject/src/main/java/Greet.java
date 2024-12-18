

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Greet extends HttpServlet {
	
	public void service(HttpServletRequest req,  HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head><title>Greeting</title></head>");
			pw.println("<body>");
			pw.println("<h1>HI THIS IS FROM THE SERVLET PROGRAM</h1>");
			pw.println("</body>");
			pw.println("</html>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
