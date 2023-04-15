package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.vikash.dto.Departments;
import in.vikash.service.IDepartmentsService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addDepartment")
public class AddDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String dep_name = request.getParameter("name");
		Departments department = new Departments();
		department.setDep_name(dep_name);
		IDepartmentsService departmentsService = ServiceFactory.getDepartmentsService();
		String msg = departmentsService.addDepartment(department);
		
		if(msg.equals("success")) {
			session.setAttribute("departmentmessage",msg);
			response.sendRedirect("./AdminHome.jsp");
		}else {
			session.setAttribute("departmentmessage",msg);
			response.sendRedirect("./AdminHome.jsp");
		}
	}

}
