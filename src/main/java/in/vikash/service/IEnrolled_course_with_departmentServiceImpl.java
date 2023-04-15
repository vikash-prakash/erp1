package in.vikash.service;

import in.vikash.dao.IEnrolled_course_with_departmentDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Enrolled_course_with_department;

public class IEnrolled_course_with_departmentServiceImpl implements IEnrolled_course_with_departmentService {
	private IEnrolled_course_with_departmentDao enrolled_course_with_departmentDao = null;
	private String msg = null;
	@Override
	public String addEnrolled_course_with_department(Enrolled_course_with_department enrolled_course_with_department) {
		enrolled_course_with_departmentDao = DaoFactory.getEnrolled_course_with_departmentDao();
		if(enrolled_course_with_departmentDao!=null)
		msg = 	enrolled_course_with_departmentDao.addEnrolled_course_with_department(enrolled_course_with_department);
		return msg;
	}

	@Override
	public String deleteEnrolled_course_with_department(Integer id) {
		enrolled_course_with_departmentDao = DaoFactory.getEnrolled_course_with_departmentDao();
		if(enrolled_course_with_departmentDao!=null)
			msg = enrolled_course_with_departmentDao.deleteEnrolled_course_with_department(id);
		return msg;
	}

	@Override
	public String updateEnrolled_course_with_department(
			Enrolled_course_with_department enrolled_course_with_department) {
		enrolled_course_with_departmentDao = DaoFactory.getEnrolled_course_with_departmentDao();
		if(enrolled_course_with_departmentDao!=null)
			msg = enrolled_course_with_departmentDao.updateEnrolled_course_with_department(enrolled_course_with_department);
		return msg;
	}

	@Override
	public Enrolled_course_with_department selectEnrolled_course_with_department() {
		Enrolled_course_with_department enrolled_course_with_department = null;
		enrolled_course_with_departmentDao = DaoFactory.getEnrolled_course_with_departmentDao();
		if(enrolled_course_with_departmentDao!=null)
			enrolled_course_with_department = enrolled_course_with_departmentDao.selectEnrolled_course_with_department();
		return enrolled_course_with_department;
	}

}
