package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Departments;
import in.vikash.util.JdbcUtil;

public class IDepartmentsDaoImpl implements IDepartmentsDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	@Override
	public String addDepartment(Departments department) {
		String sqlInsertQuery = "insert into departments(dep_name) values(?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			
			if(pstmt!=null) {
				pstmt.setString(1,department.getDep_name());
				
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
	public String deleteDepartment(Integer dep_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateDepartment(Departments department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departments selectDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
