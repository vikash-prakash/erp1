package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vikash.dto.Faculty;
import in.vikash.service.IFacultyService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addFaculty")
public class AddFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession(false);
			String name = request.getParameter("name");
			String father_name = request.getParameter("father-name");
			String gender = request.getParameter("gender");
			String mobile = request.getParameter("mobile");
			String email = request.getParameter("email");
			String qualification = request.getParameter("Qualification");
			String address = request.getParameter("Address");
			String facpassword = request.getParameter("facpassword");
			
			Faculty faculty = new Faculty();
			faculty.setFac_name(name);
			faculty.setFac_fathers_name(father_name);
			faculty.setFac_gender(gender);
			faculty.setFac_mobile(mobile);
			faculty.setFac_email(email);
			faculty.setFac_qualification(qualification);
			faculty.setFac_address(address);
			faculty.setFac_password(facpassword);
			IFacultyService facultyService = ServiceFactory.getFacultyService();	
			String msg = facultyService.addFaculty(faculty);
			if(msg.equals("success")) {
				session.setAttribute("facultymessage",msg);
				response.sendRedirect("./AdminHome.jsp");
				return;
			}else {
				session.setAttribute("facultymessage",msg);
				response.sendRedirect("./AdminHome.jsp");
			}
			
			
	}
}
