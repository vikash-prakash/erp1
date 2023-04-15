package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Classes;
import in.vikash.util.JdbcUtil;

public class IClassesDaoImpl implements IClassesDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	@Override
	public String addClass(Classes classes) {
		String sqlInsertQuery = "insert into classes(class_name) values(?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			
			if(pstmt!=null) {
				pstmt.setString(1,classes.getClass_name());
				
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
	public String deleteClass(Integer class_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUpdate(Classes classes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classes selectClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
