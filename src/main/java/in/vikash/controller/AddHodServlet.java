package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vikash.dto.Hod;
import in.vikash.service.IHodService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addHod")
public class AddHodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IHodService hodService = ServiceFactory.getHodService();
		String name = request.getParameter("name");
		String father_name = request.getParameter("father-name");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("hodpassword");
		String gender = request.getParameter("gender");
		
		Hod hod = new Hod();
		hod.setHod_name(name);
		hod.setHod_fathers_name(father_name);
		hod.setHod_gender(gender);
		hod.setHod_mobile(mobile);
		hod.setHod_email(email);
		hod.setHod_dob(dob);
		hod.setHod_password(password);
		String msg = hodService.addHod(hod);
		
		HttpSession session = request.getSession(false);
		
		if(msg.equals("success")) {
			session.setAttribute("hodmessage", msg);
			response.sendRedirect("./AdminHome.jsp");
		}else {
			session.setAttribute("hodmessage", msg);
			response.sendRedirect("./AdminHome.jsp");
		}
	}

}
