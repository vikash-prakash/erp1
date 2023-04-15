package in.vikash.util;

import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		
		HikariConfig config = new HikariConfig("E:\\JEE java projects\\ERP\\src\\main\\java\\in\\vikash\\properties\\erp.properties");
		
		@SuppressWarnings("resource")
		HikariDataSource dataSource = new HikariDataSource(config);
		return dataSource.getConnection();
		//return physicalConnection();
	}
	
public static void cleanUp(Connection connection,Statement st, ResultSet rs) {
		
		if(connection !=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		if(st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		if(rs != null) {
			try {
				rs.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
