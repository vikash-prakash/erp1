package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Course;
import in.vikash.util.JdbcUtil;

public class ICourseDaoImpl implements ICourseDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	
	@Override
	public String addCourse(Course course) {
		String sqlInsertQuery = "insert into course(course_name) values(?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			
			if(pstmt!=null) {
				pstmt.setString(1,course.getCourse_name());
				
				rowAffect = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, null);
		}
		
		if(rowAffect == 1) {
			msg ="success";
		}else {
			msg = "failure";
		}
		return msg;
	}

	@Override
	public String deleteCourse(Integer course_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course selectCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
