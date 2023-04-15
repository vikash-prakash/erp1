package in.vikash.service;

import in.vikash.dao.IFaculty_enrolled_with_classDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Faculty_enrolled_with_class;

public class IFaculty_enrolled_with_classServiceImpl implements IFaculty_enrolled_with_classService {
	private IFaculty_enrolled_with_classDao faculty_enrolled_with_classDao = null;
	private String msg;
	@Override
	public String addFaculty_enrolled_with_class(Faculty_enrolled_with_class faculty_enrolled_with_class) {
		faculty_enrolled_with_classDao = DaoFactory.getFaculty_enrolled_with_classDao();
		if(faculty_enrolled_with_classDao!=null)
			msg = faculty_enrolled_with_classDao.addFaculty_enrolled_with_class(faculty_enrolled_with_class);
		return msg;
	}

	@Override
	public String deleteFaculty_enrolled_with_class(Integer id) {
		faculty_enrolled_with_classDao = DaoFactory.getFaculty_enrolled_with_classDao();
		if(faculty_enrolled_with_classDao!=null)
			msg = faculty_enrolled_with_classDao.deleteFaculty_enrolled_with_class(id);
		return msg;
	}

	@Override
	public String updateFaculty_enrolled_with_class(Faculty_enrolled_with_class faculty_enrolled_with_class) {
		faculty_enrolled_with_classDao = DaoFactory.getFaculty_enrolled_with_classDao();
		if(faculty_enrolled_with_classDao!=null)
			msg = faculty_enrolled_with_classDao.updateFaculty_enrolled_with_class(faculty_enrolled_with_class);
		return msg;
	}

	@Override
	public Faculty_enrolled_with_class selectFaculty_enrolled_with_class() {
		Faculty_enrolled_with_class faculty_enrolled_with_class = null;
		faculty_enrolled_with_classDao = DaoFactory.getFaculty_enrolled_with_classDao();
		if(faculty_enrolled_with_classDao!=null)
			faculty_enrolled_with_class = faculty_enrolled_with_classDao.selectFaculty_enrolled_with_class();
		return faculty_enrolled_with_class;
	}

}
