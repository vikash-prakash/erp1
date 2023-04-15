package in.vikash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Student;
import in.vikash.util.JdbcUtil;

public class IStudentDaoImpl implements IStudentDao{
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet rs =null;
	@Override
	public String addStudent(Student std) throws PoolInitializationException{
		String sqlInsertQuery="insert into student(std_name,std_fathers_name,std_gender,std_dob,std_mobile,std_email,mothers_name,religion,address,nation,state,city,pincode,tenth_school_name,twelth_school_name,tenth_school_board,twelth_school_board,tenth_passout_date,twelth_passout_year,semester,session,tenth_percentage,twelth_percentage) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Integer rowAffect=0;
		String msg =null;
		try {
			connection = JdbcUtil.getConnection();
			if(connection!=null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			if(pstmt!=null) {
				pstmt.setString(1, std.getStd_name());
				pstmt.setString(2, std.getStd_fathers_name());
				pstmt.setString(3, std.getStd_gender());
				pstmt.setString(4, std.getStd_dob());
				pstmt.setString(5, std.getStd_mobile());
				pstmt.setString(6, std.getStd_email());
				pstmt.setString(7, std.getStd_mothers_name());
				pstmt.setString(8, std.getStd_religion());
				pstmt.setString(9, std.getStd_address());
				pstmt.setString(10, std.getStd_country());
				pstmt.setString(11, std.getStd_state());
				pstmt.setString(12, std.getStd_city());
				pstmt.setInt(13, std.getStd_pincode());
				pstmt.setString(14, std.getStd_tenth_sch_name());
				pstmt.setString(15, std.getStd_twelth_sch_name());
				pstmt.setString(16, std.getStd_tenth_sch_board());
				pstmt.setString(17, std.getStd_twelth_sch_board());
				pstmt.setString(18, std.getStd_tenth_passout_year());
				pstmt.setString(19, std.getStd_twetlh_passout_year());
				pstmt.setInt(20, std.getStd_semester());
				pstmt.setString(21, std.getStd_session());
				pstmt.setFloat(22, std.getStd_tenth_sch_per());
				pstmt.setFloat(23,std.getStd_twelth_sch_per());
				rowAffect = pstmt.executeUpdate();
			}
		}catch (PoolInitializationException e) {
			
			throw e;
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		if(rowAffect==1) {
			msg="success";
		}else {
			msg="failure";
		}
		
		return msg;
	}

	@Override
	public String deleteStudent(Integer std_id) {
		String sqlDeleteQuery = "delete from student where std_id=?";
		Integer rowAffect = 0 ;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlDeleteQuery);
				
			}
			if(pstmt!=null) {
				pstmt.setInt(1, std_id);
				
				rowAffect = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		
		if(rowAffect==1) {
			msg="success";
		}else {
			msg = "failure";
		}
		return msg;
	}

	@Override
	public String updateStudent(Student std) {
		String sqlUpdateQuery = "update student set std_name=?,std_fathers_name=?,std_gender=?,std_dob=?,std_mobile=?,std_email=? where std_id=?";
		Integer rowAffect = 0 ;
		String msg = null;
		try {
			connection = JdbcUtil.getConnection();
			if(connection != null) {
				pstmt = connection.prepareStatement(sqlUpdateQuery);
				
			}
			if(pstmt!=null) {
				pstmt.setString(1, std.getStd_name());
				pstmt.setString(2, std.getStd_fathers_name());
				pstmt.setString(3, std.getStd_gender());
				pstmt.setString(4, std.getStd_dob());
				pstmt.setString(5, std.getStd_mobile());
				pstmt.setString(6, std.getStd_email());
				pstmt.setInt(7, std.getStd_id());
				rowAffect = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		
		if(rowAffect==1) {
			msg="success";
		}else {
			msg = "failure";
		}
		return msg;
	}

	@Override
	public ArrayList<Student> selectStudent() {
		String sqlSelectSudent = "select * from student";
		ArrayList<Student> students = new ArrayList<>();
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection!=null) {
				 pstmt = connection.prepareStatement(sqlSelectSudent);
			}
			
			if(pstmt!=null) {
				rs = pstmt.executeQuery();
			}
			while(rs.next()) {
				Student std = new Student();
				std.setStd_id(rs.getInt(1));
				std.setStd_name(rs.getString(2));
				std.setStd_fathers_name(rs.getString(3));
				std.setStd_gender(rs.getString(4));
				std.setStd_dob(rs.getString(5));
				std.setStd_mobile(rs.getString(6));
				std.setStd_email(rs.getString(7));
				students.add(std);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		return students;
	}

	@Override
	public Student selectStudentForGivenId(Integer std_id) {
		String sqlSelectSudent = "select * from student where std_id=?";
		Student std = new Student();
		try {
			connection = JdbcUtil.getConnection();
			
			if(connection!=null) {
				 pstmt = connection.prepareStatement(sqlSelectSudent);
			}
			
			if(pstmt!=null) {
				pstmt.setInt(1, std_id);
				rs = pstmt.executeQuery();
			}
			if(rs.next()) {
				if(std!=null) {
				std.setStd_id(rs.getInt(1));
				std.setStd_name(rs.getString(2));
				std.setStd_fathers_name(rs.getString(3));
				std.setStd_gender(rs.getString(4));
				std.setStd_dob(rs.getString(5));
				std.setStd_mobile(rs.getString(6));
				std.setStd_email(rs.getString(7));
				}
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(connection, pstmt, rs);
		}
		return std;
	}

}
