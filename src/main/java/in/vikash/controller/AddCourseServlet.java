package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vikash.dto.Course;
import in.vikash.service.ICourseService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addCourse")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String course_name = request.getParameter("name");
		Course course = new Course();
		course.setCourse_name(course_name);
		ICourseService courseService = ServiceFactory.getCourseService();
		String msg = courseService.addCourse(course);
		
		if(msg.equals("success")) {
			session.setAttribute("coursemessage", msg);
			response.sendRedirect("./AdminHome.jsp");
		}else {
			session.setAttribute("coursemessage", msg);
			response.sendRedirect("./AdminHome.jsp");
		}
	}

}
