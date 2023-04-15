package in.vikash.service;

import in.vikash.dao.IEnrolled_hod_with_departmentDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Enrolled_hod_with_department;

public class IEnrolled_hod_with_departmentServiceImpl implements IEnrolled_hod_with_departmentService {
	private IEnrolled_hod_with_departmentDao enrolled_hod_with_departmentDao = null;
	private String msg;
	@Override
	public String addEnrolled_hod_with_department(Enrolled_hod_with_department enrolled_hod_with_department) {
		  enrolled_hod_with_departmentDao = DaoFactory.getEnrolled_hod_with_departmentDao();
		 if(enrolled_hod_with_department!=null)
			 msg = enrolled_hod_with_departmentDao.addEnrolled_hod_with_department(enrolled_hod_with_department);
		return msg;
	}

	@Override
	public String deleteEnrolled_hod_with_department(Integer id) {
		enrolled_hod_with_departmentDao = DaoFactory.getEnrolled_hod_with_departmentDao();
		if(enrolled_hod_with_departmentDao !=null)
			msg = enrolled_hod_with_departmentDao.deleteEnrolled_hod_with_department(id);
		return msg;
	}

	@Override
	public String updateEnrolled_hod_with_department(Enrolled_hod_with_department enrolled_hod_with_department) {
		enrolled_hod_with_departmentDao = DaoFactory.getEnrolled_hod_with_departmentDao();
		if(enrolled_hod_with_departmentDao!=null)
			msg = enrolled_hod_with_departmentDao.updateEnrolled_hod_with_department(enrolled_hod_with_department);
		return msg;
	}

	@Override
	public Enrolled_hod_with_department selectEnrolled_hod_with_department() {
		Enrolled_hod_with_department enrolled_hod_with_department = null;
		enrolled_hod_with_departmentDao = DaoFactory.getEnrolled_hod_with_departmentDao();
		if(enrolled_hod_with_departmentDao!=null)
			enrolled_hod_with_department = enrolled_hod_with_departmentDao.selectEnrolled_hod_with_department();
		return enrolled_hod_with_department;
	}

}
