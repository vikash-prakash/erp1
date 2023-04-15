package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.vikash.dto.Enrolled_student_with_class;
import in.vikash.util.JdbcUtil;

public class IEnrolled_student_with_classDaoImpl implements IEnrolled_student_with_classDao{

	@Override
	public String addEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEnrolled_student_with_class(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enrolled_student_with_class selectEnrolled_student_with_class() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enrolled_student_with_class selectEnrolled_student_with_classForGivenId(Integer id) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		Enrolled_student_with_class enrolled_student_with_class  = new Enrolled_student_with_class();;
		String selectQuery = "select * from enrolled_student_with_class where std_id=?";
			try {
				connection = JdbcUtil.getConnection();
				
				if(connection!=null) {
					
					pstmt = connection.prepareStatement(selectQuery);
				}
				if(pstmt != null) {
					pstmt.setInt(1, id);
					
					rs = pstmt.executeQuery();
					
				}
				if(rs!= null) {
					if(rs.next()) {
						enrolled_student_with_class.setId(rs.getInt(1));
						enrolled_student_with_class.setStd_id(rs.getInt(2));
						enrolled_student_with_class.setClass_id(rs.getInt(3));
						enrolled_student_with_class.setRoll_no(rs.getString(4));
						enrolled_student_with_class.setOfficial_mail(rs.getString(5));
						enrolled_student_with_class.setStd_password(rs.getString(6));
					}
					
					
					
					
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				JdbcUtil.cleanUp(connection,pstmt, rs);
			}
		return enrolled_student_with_class;
	}

}
