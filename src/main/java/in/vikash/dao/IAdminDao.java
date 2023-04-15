package in.vikash.dao;

import java.util.ArrayList;


import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Admin;

public interface IAdminDao {
	public String addAdmin(Admin admin);
	public String deleteAdmin(Integer admin_id );
	public String updateAdmin(Admin admin);
	public ArrayList<Admin> selectAdmin() throws PoolInitializationException;
}
