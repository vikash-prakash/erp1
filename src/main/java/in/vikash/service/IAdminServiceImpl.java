package in.vikash.service;

import java.util.ArrayList;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dao.IAdminDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Admin;


public class IAdminServiceImpl implements IAdminService {
	IAdminDao adminDao = null;
	String msg = null;
	
	@Override
	public String addAdmin(Admin admin) {
		adminDao = DaoFactory.getAdminDao();
		
		if(adminDao != null)
			msg = adminDao.addAdmin(admin);
		
		return msg;
	}

	@Override
	public String deleteAdmin(Integer admin_id) {
		adminDao = DaoFactory.getAdminDao();
		if(adminDao != null)
			msg = adminDao.deleteAdmin(admin_id);
		return msg;
	}

	@Override
	public String updateAdmin(Admin admin) {
		adminDao = DaoFactory.getAdminDao();
		if(adminDao!= null)
			msg = adminDao.updateAdmin(admin);
		return msg;
	}

	@Override
	public ArrayList<Admin> selectAdmin() throws PoolInitializationException {
		ArrayList<Admin> adminlist = null;
		adminDao = DaoFactory.getAdminDao();
		if(adminDao!=null)
			adminlist = adminDao.selectAdmin();
		return adminlist;
	}

}
