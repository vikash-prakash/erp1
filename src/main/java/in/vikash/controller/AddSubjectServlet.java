package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vikash.dto.Subject;
import in.vikash.service.ISubjectService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addSubject")
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String sub_name = request.getParameter("name");
		String sub_code = request.getParameter("code");
		
		Subject subject = new Subject();
		subject.setSub_name(sub_name);
		subject.setSub_code(sub_code);
		
		ISubjectService subjectService = ServiceFactory.getSubjectService();
		String msg = subjectService.addSubject(subject);
		if(msg.equals("success")) {
			session.setAttribute("subjectmessage",msg);
			response.sendRedirect("./AdminHome.jsp");
		}else {
			session.setAttribute("subjectmessage",msg);
			response.sendRedirect("./AdminHome.jsp");
		}
	}

}
