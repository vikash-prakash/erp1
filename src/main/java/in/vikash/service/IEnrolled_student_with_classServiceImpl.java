package in.vikash.service;

import in.vikash.dao.IEnrolled_student_with_classDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Enrolled_student_with_class;

public class IEnrolled_student_with_classServiceImpl implements IEnrolled_student_with_classService {
	private IEnrolled_student_with_classDao enrolled_student_with_classDao = null;
	private String msg;
	@Override
	public String addEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class) {
		enrolled_student_with_classDao = DaoFactory.getEnrolled_student_with_classDao();
		if(enrolled_student_with_classDao!=null)
			msg = enrolled_student_with_classDao.addEnrolled_student_with_class(enrolled_student_with_class);
		return msg;
	}

	@Override
	public String deleteEnrolled_student_with_class(Integer id) {
		enrolled_student_with_classDao = DaoFactory.getEnrolled_student_with_classDao();
		if(enrolled_student_with_classDao!=null)
			msg = enrolled_student_with_classDao.deleteEnrolled_student_with_class(id);
		return msg;
	}

	@Override
	public String updateEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class) {
		enrolled_student_with_classDao = DaoFactory.getEnrolled_student_with_classDao();
		if(enrolled_student_with_classDao!=null)
			msg = enrolled_student_with_classDao.updateEnrolled_student_with_class(enrolled_student_with_class);
		return msg;
	}

	@Override
	public Enrolled_student_with_class selectEnrolled_student_with_class() {
		Enrolled_student_with_class enrolled_student_with_class = null;
		enrolled_student_with_classDao = DaoFactory.getEnrolled_student_with_classDao();
		if(enrolled_student_with_classDao!=null)
			enrolled_student_with_class = enrolled_student_with_classDao.selectEnrolled_student_with_class();
		return enrolled_student_with_class;
	}

	@Override
	public Enrolled_student_with_class selectEnrolled_student_with_classForGivenId(Integer id) {
		Enrolled_student_with_class selectEnrolled_student_with_classForGivenId = null;
		enrolled_student_with_classDao = DaoFactory.getEnrolled_student_with_classDao();
		if(enrolled_student_with_classDao !=null) {
			selectEnrolled_student_with_classForGivenId = enrolled_student_with_classDao.selectEnrolled_student_with_classForGivenId(id);
		}
		return selectEnrolled_student_with_classForGivenId;
	}

}
