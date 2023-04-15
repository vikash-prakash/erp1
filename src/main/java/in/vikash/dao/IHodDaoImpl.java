package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.vikash.dto.Hod;
import in.vikash.util.JdbcUtil;

public class IHodDaoImpl implements IHodDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	
	@Override
	public String addHod(Hod hod) {
		String sqlInsertQuery = "insert into hod(hod_name,hod_fathers_name,hod_gender,hod_mobile,hod_email,hod_dob,hod_password) values(?,?,?,?,?,?,?)";
		Integer rowAffect = 0;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
				
			}
			if(pstmt!=null) {
				pstmt.setString(1, hod.getHod_name());
				pstmt.setString(2, hod.getHod_fathers_name());
				pstmt.setString(3, hod.getHod_gender());
				pstmt.setString(4, hod.getHod_mobile());
				pstmt.setString(5, hod.getHod_email());
				pstmt.setString(6, hod.getHod_dob());
				pstmt.setString(7, hod.getHod_password());
				
				
				rowAffect = pstmt.executeUpdate();
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(rowAffect==1) {
			msg="success";
		}else {
			msg="failure";
		}
		return msg;
	}

	@Override
	public String deleteHod(Integer hod_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateHod(Hod hod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hod selectHod() {
		// TODO Auto-generated method stub
		return null;
	}

}
