package calculateGrade.servlet;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculateGrade.referenceClass.ReferenceClass;
import university.course.Subject;
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
		//student profile from form
		String studentId = request.getParameter("studentId");
		String year = request.getParameter("year");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String department = request.getParameter("department");
		
		request.setAttribute("studentId", studentId);
		request.setAttribute("year", year);
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		request.setAttribute("department", department);
		
		try {
			Person student = (Person) ReferenceClass.refClass(Person.class.getName());
			student.setId(studentId);
			student.setFullName(fname, lname);
			student.setYear(year);
			student.setDept(department);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append(e.getMessage() + " ").append(request.getContextPath());
		}
		
		//grade for calculating from form
		String[] subjectId = new String[3];
		String[] subjectName = new String[3];
		int[] credit = new int[3];
		String[] grade = new String[3];
		for(int i = 1 ; i <= 3 ; i++){
			subjectId[i-1] = request.getParameter("subid"+i);
			subjectName[i-1] = request.getParameter("sub"+i);
			credit[i-1] = Integer.parseInt(request.getParameter("credit"+i));
			grade[i-1] = request.getParameter("grade"+i);
		}
		
		try {
			Subject subject1 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject1.setSubjectId(subjectId[0]);
			subject1.setSubjectName(subjectName[0]);
			subject1.setCredit(credit[0]);
			subject1.setGrade(grade[0]);
			Subject subject2 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject2.setSubjectId(subjectId[1]);
			subject2.setSubjectName(subjectName[1]);
			subject2.setCredit(credit[1]);
			subject2.setGrade(grade[1]);
			Subject subject3 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject3.setSubjectId(subjectId[2]);
			subject3.setSubjectName(subjectName[2]);
			subject3.setCredit(credit[2]);
			subject3.setGrade(grade[2]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append(e.getMessage() + " ").append(request.getContextPath());
		}
		
		
		//get subject profile from form
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}
	


}
