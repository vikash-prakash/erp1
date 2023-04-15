package in.vikash.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Admin;
import in.vikash.service.IAdminService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("password", password);
		session.setAttribute("email", email);
		
		IAdminService adminService = ServiceFactory.getAdminService();
		ArrayList<Admin> adminlist = null;
		try {
			adminlist = adminService.selectAdmin();
		} catch (PoolInitializationException e) {
			
			response.getWriter().print("Some Internal Database Error!!");
		}
		boolean flag = false;
		
		for(Admin admin : adminlist) {
			if(admin.getAdmin_email().equals(email) && admin.getAdmin_password().equals(password)) {
				session.setAttribute("name", admin.getAdmin_name());
				session.setAttribute("id", admin.getAdmin_id());
				session.setAttribute("email",admin.getAdmin_email());
				session.setAttribute("mobile", admin.getAdmin_mobile());
				session.setAttribute("message","loggedin");
				flag = true;
				response.sendRedirect("./AdminHome.jsp");
				break;
			}
				
			
		}
		
		if(flag==false) {
			session.setAttribute("message", "loginfailed");
			response.sendRedirect("./AdminLogin.jsp");
			
		}
	}

}
