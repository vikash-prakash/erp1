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


@WebServlet("/showStudent")
public class ShowStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IStudentService studentService = ServiceFactory.getStudentService();
		ArrayList<Student> studentRecords = studentService.selectStudent();
		PrintWriter out = response.getWriter();
		out.println("<html><head><link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'><title>show student</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<th>ID</th><th>ROLL NO</th><th>NAME</th><th>FATHERS NAME</th><th>MOBILE</th><th>EMAIL</th><th>GENDER</th><th>DATE OF BIRTH</th><th colspan='2'>operation</th>");
		
		ArrayList<String> rollnos = new ArrayList<>();
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		rollnos.add("191020102027");
		int i=0;
		
		
		for(Student student : studentRecords) {
			String delurl="./deleteStudent?id="+student.getStd_id();
			String updurl="./updateStudent?id="+student.getStd_id();
			String delete= response.encodeURL(delurl);
			String update= response.encodeURL(updurl);
			out.println("<tr><td>"+student.getStd_id()+"</td><td>"+rollnos.get(i++)+"</td>"
					+ "<td>"+student.getStd_name()+"</td><td>"+student.getStd_fathers_name()+"</td>"
							+ "<td>"+student.getStd_mobile()+"</td><td>"+student.getStd_email()+"</td>"
									+ "<td>"+student.getStd_gender()+"</td><td>"+student.getStd_dob()+"</td>"
											+ "<td><a href='"+update+"'><i class='fa fa-edit'></i><a></td>"
													+ "<td><a href='"+delete+"' ><i class='fa fa-trash'></i></a></td></tr>");
			
		}
		out.println("</table><button onclick='window.print()'>print</button></body></html>");
	}

}
