package calculateGrade.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculateGrade.referenceClass.ReferenceClass;
import university.person.Person;

/**
 * Servlet implementation class CalculateGrade
 */
@WebServlet("/CalculateGrade")
public class CalculateGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateGrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get student profile from form
		String studentId = request.getParameter("studentId");
		String year = request.getParameter("year");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String department = request.getParameter("department");
		
		try {
			Person student = (Person) ReferenceClass.refClass(Person.class.getName());
			student.setFname(fname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get subject profile from form
		
		for(int i = 1 ; i <= 3 ; i++){
			
		}
		
	}
	


}
