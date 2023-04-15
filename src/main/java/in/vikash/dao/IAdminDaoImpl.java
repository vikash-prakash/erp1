package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Admin;
import in.vikash.util.JdbcUtil;

public class IAdminDaoImpl implements IAdminDao{

	

	@Override
	public String addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(Integer admin_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Admin> selectAdmin() throws PoolInitializationException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Admin> adminlist = new ArrayList<>();
		String sqlSelectQuery = "select * from admin";
		
		try {
			connection = JdbcUtil.getConnection();
			if(connection!= null)
				pstmt = connection.prepareStatement(sqlSelectQuery);
			if(pstmt!=null)
				rs =pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					Admin admin = new Admin();
					admin.setAdmin_id(rs.getInt(1));
					admin.setAdmin_name(rs.getString(2));
					admin.setAdmin_mobile(rs.getString(3));
					admin.setAdmin_email(rs.getString(4));
					admin.setAdmin_password(rs.getString(5));
					adminlist.add(admin);
					
				}
			}
			
			
		} catch (PoolInitializationException e) {
			
			throw e;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		
		return adminlist;
		
	}
	
	
	
	
	
	
}
