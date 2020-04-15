import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.student.StudentFactory;
import model.student.Student;
import model.student.StudentId;


public class StudentController extends HttpServlet {
	
	private ServletContext context;

	public void init() throws ServletException {
		context = getServletContext();
	}

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
		StudentId studentId = null;
		try{
			String id = request.getParameter("id");
			Integer idInt = Integer.parseInt(id);
			studentId = new StudentId(idInt);
		} catch( Exception e ){
			context.getRequestDispatcher( "/Error.jsp" ).forward( request, response );
		}

		if(StudentFactory.notExistsStudent(studentId)){
			context.getRequestDispatcher( "/StudentNotFond.jsp" ).forward( request, response );
		}

		Student student = StudentFactory.findBy(studentId);

		request.setAttribute("student", student);
		
		context.getRequestDispatcher( "/Student.jsp" ).forward( request, response );
	}
}