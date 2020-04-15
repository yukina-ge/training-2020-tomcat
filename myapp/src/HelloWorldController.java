import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.student.StudentFactory;
import model.student.Student;


public class HelloWorldController extends HttpServlet {
	
	private ServletContext context;

	public void init() throws ServletException {
		context = getServletContext();
	}

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {


	}
}