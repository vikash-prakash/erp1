package in.vikash.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vikash.dto.Student;
import in.vikash.service.IStudentService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStudentService studentService = ServiceFactory.getStudentService();
		Student student = studentService.selectStudentForGivenId(Integer.parseInt(request.getParameter("id")));
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>update student</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<th>NAME</th><th>FATHERS NAME</th><th>MOBILE</th><th>EMAIL</th><th>GENDER</th><th>DATE OF BIRTH</th>");
		
			out.println("<form action='./updateStudent' method='post' ><tr><td><input type='hidden' value='"+request.getParameter("id")+"' name='id'/><td><input type='text' value='"+student.getStd_name()+"' name='name' /></td><td><input type='text' value='"+student.getStd_fathers_name()+"' name='fathers_name' /></td><td><input type='number' value='"+student.getStd_mobile()+"' name='mobile' /></td><td><input type='text' value='"+student.getStd_email()+"' name='email' /></td><td><input type='text' value='"+student.getStd_gender()+"' name='gender' /></td><td><input type='date' value='"+student.getStd_dob()+"' name='dob' /></td><td><input type='submit' value='submit' name='submit' /></tr></form>");
		
		out.println("</table><form action='./logout' method='post' ><input type='submit' value='logout' /></form></body></html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStudentService studentService = ServiceFactory.getStudentService();
		Student student = new Student();
		student.setStd_id(Integer.parseInt(request.getParameter("id")));
		student.setStd_name(request.getParameter("name"));
		student.setStd_fathers_name(request.getParameter("fathers_name"));
		student.setStd_mobile(request.getParameter("mobile"));
		student.setStd_email(request.getParameter("email"));
		student.setStd_gender(request.getParameter("gender"));
		student.setStd_dob(request.getParameter("dob"));
		String msg = studentService.updateStudent(student);
		if(msg.equals("success")) {
			response.getWriter().println("successfully updated!!");
		}else {
			response.getWriter().println("something went wrong!!");
		}
	}

}
