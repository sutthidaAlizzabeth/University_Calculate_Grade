package calculateGrade.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
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
	@EJB
	private Person student;
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
		//ดึงข้อมูล student ออกจาก Form == get student profile from form
		String studentId = request.getParameter("studentId");
		String year = request.getParameter("year");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String department = request.getParameter("department");
		
		//ส่งข้อมูลเตรียมแสดงผลใน result.jsp ==send value to result.jsp
		request.setAttribute("studentId", studentId);
		request.setAttribute("year", year);
		request.setAttribute("fname", fname);
		request.setAttribute("lname", lname);
		//request.setAttribute("department", department);
		
		//สร้าง student object พร้อมกำหนดค่า
		try {
			//Person student = (Person) ReferenceClass.refClass(Person.class.getName());
			student.setId(studentId);
			student.setFullName(fname, lname);
			student.setYear(year);
			student.setDept(department);
			
			request.setAttribute("department", student.getDept());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append(e.getMessage() + " ").append(request.getContextPath());
		}
		
		//ดึงข้อมูลเกรดจาก form เพื่อเตรียมประมวลผล == grade for calculating from form
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
		
		//ส่งข้อมูลไปแสดงผลที่ result.jsp ==send values to result.jsp
		request.setAttribute("subId1", subjectId[0]);
		request.setAttribute("subId2", subjectId[1]);
		request.setAttribute("subId3", subjectId[2]);
		request.setAttribute("sub1", subjectName[0]);
		request.setAttribute("sub2", subjectName[1]);
		request.setAttribute("sub3", subjectName[2]);
		request.setAttribute("credit1", credit[0]);
		request.setAttribute("credit2", credit[1]);
		request.setAttribute("credit3", credit[2]);
		/*request.setAttribute("grade1", grade[0]);
		request.setAttribute("grade2", grade[1]);
		request.setAttribute("grade3", grade[2]);*/
		
		//สร้าง subject object เพื่อให้ใช้การประมวลผล ==create student object for calculating
		Subject subject1 = null;
		Subject subject2 = null;
		Subject subject3 = null;
		try {
			subject1 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject1.setSubjectId(subjectId[0]);
			subject1.setSubjectName(subjectName[0]);
			subject1.setCredit(credit[0]);
			subject1.setGrade(grade[0]);
			subject2 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject2.setSubjectId(subjectId[1]);
			subject2.setSubjectName(subjectName[1]);
			subject2.setCredit(credit[1]);
			subject2.setGrade(grade[1]);
			subject3 = (Subject) ReferenceClass.refClass(Subject.class.getName());
			subject3.setSubjectId(subjectId[2]);
			subject3.setSubjectName(subjectName[2]);
			subject3.setCredit(credit[2]);
			subject3.setGrade(grade[2]);
			
			//debug getGPA method
			request.setAttribute("grade1", subject1.getCredit());
			request.setAttribute("grade2", subject2.getCredit());
			request.setAttribute("grade3", subject3.getCredit());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.getWriter().append(e.getMessage() + " ").append(request.getContextPath());
		}
		
		//create List for collecting subject object to calculating grade
		List<Subject> subList = new ArrayList<Subject>();
		subList.add(subject1);
		subList.add(subject2);
		subList.add(subject3);
		
		//calculating gpa
		//double gpa = subject1.getGPA(subList);
		//request.setAttribute("gpa", gpa);
		
		//get subject profile from form
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}
	


}
