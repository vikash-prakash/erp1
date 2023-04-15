package in.vikash.service;


import in.vikash.dao.IDepartmentsDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Departments;

public class IDepartmentsServiceImpl implements IDepartmentsService {

	private IDepartmentsDao departmentDao = null;
	private String msg=null;
	@Override
	public String addDepartment(Departments department) {
		departmentDao = DaoFactory.getDepartmentsDao();
		if(departmentDao!= null)
			msg = departmentDao.addDepartment(department);
		return msg;
	}

	@Override
	public String deleteDepartment(Integer dep_id) {
		departmentDao = DaoFactory.getDepartmentsDao();
		if(departmentDao!=null)
			msg = departmentDao.deleteDepartment(dep_id);
		return msg;
	}

	@Override
	public String updateDepartment(Departments department) {
		departmentDao = DaoFactory.getDepartmentsDao();
		if(departmentDao!=null)
			msg = departmentDao.updateDepartment(department);
		return msg;
	}

	@Override
	public Departments selectDepartment() {
		Departments department = null;
		departmentDao = DaoFactory.getDepartmentsDao();
		if(departmentDao!=null)
			department = departmentDao.selectDepartment();
		return department;
	}

}
