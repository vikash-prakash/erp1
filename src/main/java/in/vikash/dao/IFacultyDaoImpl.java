package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Faculty;
import in.vikash.util.JdbcUtil;

public class IFacultyDaoImpl implements IFacultyDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	@Override
	public String addFaculty(Faculty faculty) {
		String sqlInsertQuery = "insert into faculty(fac_name,fac_fathers_name,fac_gender,fac_mobile,fac_email,fac_qualification,fac_address,fac_password) values(?,?,?,?,?,?,?,?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			if(pstmt != null) {
				pstmt.setString(1, faculty.getFac_name());
				pstmt.setString(2, faculty.getFac_fathers_name());
				pstmt.setString(3, faculty.getFac_gender());
				pstmt.setString(4, faculty.getFac_mobile());
				pstmt.setString(5, faculty.getFac_email());
				pstmt.setString(6, faculty.getFac_qualification());
				pstmt.setString(7, faculty.getFac_address());
				pstmt.setString(8, faculty.getFac_password());
				
				rowAffect = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, null);
		}
		
		if(rowAffect==1) {
			msg ="success";
		}else {
			msg = "failure";
		}
		return msg;
	}

	@Override
	public String deleteFaculty(Integer fac_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faculty selectFaculty() {
		// TODO Auto-generated method stub
		return null;
	}

}
