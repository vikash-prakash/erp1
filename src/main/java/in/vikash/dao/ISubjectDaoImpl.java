package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Subject;
import in.vikash.util.JdbcUtil;

public class ISubjectDaoImpl implements ISubjectDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	
	@Override
	public String addSubject(Subject subject) {
		String sqlInsertQuery = "insert into subject(sub_name,sub_code) values(?,?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			
			if(pstmt!=null) {
				pstmt.setString(1,subject.getSub_name());
				pstmt.setString(2,subject.getSub_code());
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
	public String deleteSubject(Integer sub_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subject selectSubject() {
		// TODO Auto-generated method stub
		return null;
	}

}
