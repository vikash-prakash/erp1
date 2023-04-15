package in.vikash.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Student;
import in.vikash.service.IStudentService;
import in.vikash.serviceFactory.ServiceFactory;


@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String name = request.getParameter("name");
		String father_name = request.getParameter("father-name");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile-no");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String mother_name = request.getParameter("mother-name");
		Integer semester = Integer.parseInt(request.getParameter("semester"));
		String religion = request.getParameter("religion");
		String nation = request.getParameter("nation");
		String sess = request.getParameter("session");
		String address = request.getParameter("address");
		Integer pincode = Integer.parseInt(request.getParameter("pincode"));
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String tenth_school_name = request.getParameter("10th-school-name");
		String tenth_school_board = request.getParameter("10th-school-board");
		Float tenth_percentage = Float.parseFloat(request.getParameter("10th-percentage"));
		String tenth_passout_date = request.getParameter("10th-passout-date");
		String twelth_school_name = request.getParameter("12th-school-name");
		String twelth_school_board = request.getParameter("12th-school-board");
		Float twelth_percentage = Float.parseFloat(request.getParameter("12th-percentage"));
		String twelth_passout_date = request.getParameter("12th-passout-date");
		
		
		Student student =new Student();
		student.setStd_name(name);
		student.setStd_fathers_name(father_name);
		student.setStd_mothers_name(mother_name);
		student.setStd_dob(dob);
		student.setStd_mobile(mobile);
		student.setStd_email(email);
		student.setStd_gender(gender);
		student.setStd_tenth_passout_year(tenth_passout_date);
		student.setStd_tenth_sch_board(tenth_school_board);
		student.setStd_tenth_sch_name(tenth_school_name);
		student.setStd_tenth_sch_per(tenth_percentage);
		student.setStd_twetlh_passout_year(twelth_passout_date);
		student.setStd_twelth_sch_board(twelth_school_board);
		student.setStd_twelth_sch_name(twelth_school_name);
		student.setStd_twelth_sch_per(twelth_percentage);
		student.setStd_address(address);
		student.setStd_city(city);
		student.setStd_country(nation);
		student.setStd_pincode(pincode);
		student.setStd_religion(religion);
		student.setStd_semester(semester);
		student.setStd_session(sess);
		student.setStd_state(state);
		
		
		String msg=null;
		
		IStudentService studentService = ServiceFactory.getStudentService();
		try {
			msg = studentService.addStudent(student);
			
		}catch(PoolInitializationException e) {
			response.getWriter().println("some internal error occored!!");
			return;
		}
		
		if(msg.equals("success")) {
			
			session.setAttribute("message",msg);
			response.sendRedirect("./AdminHome.jsp");
		}else {
			session.setAttribute("message",msg);
			response.sendRedirect("./AdminHome.jsp");
		}
		
	}

}
