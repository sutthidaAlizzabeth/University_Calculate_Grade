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
		response.getWriter().append("---in doPost method---").append(request.getContextPath());
		//get student profile from form
		System.out.println("-get values from jsp form");
		String studentId = request.getParameter("studentId");
		String year = request.getParameter("year");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String department = request.getParameter("department");
		response.getWriter().append("-./get values from jsp form").append(request.getContextPath());
		
		try {
			response.getWriter().append("-set values to Student object").append(request.getContextPath());
			Person student = (Person) ReferenceClass.refClass(Person.class.getName());
			student.setId(studentId);
			student.setFullName(fname, lname);
			student.setYear(year);
			student.setDept(department);
			response.getWriter().append("-./set values to Student object").append(request.getContextPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//get subject profile from form
		response.getWriter().append("-dispatchatcher").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}
	


}
