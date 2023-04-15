package in.vikash.service;

import in.vikash.dao.ISubject_assigned_to_facultyDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Subject_assigned_to_faculty;

public class ISubject_assigned_to_facultyServiceImpl implements ISubject_assigned_to_facultyService {
	private ISubject_assigned_to_facultyDao subject_assigned_to_facultyDao = null;
	private String msg = null;
	@Override
	public String addSubject_assigned_to_faculty(Subject_assigned_to_faculty subject_assigned_to_faculty) {
		subject_assigned_to_facultyDao = DaoFactory.getSubject_assigned_to_facultyDao();
		if(subject_assigned_to_facultyDao!=null)
			msg = subject_assigned_to_facultyDao.addSubject_assigned_to_faculty(subject_assigned_to_faculty);
		return msg;
	}

	@Override
	public String deleteSubject_assigned_to_faculty(Integer id) {
		subject_assigned_to_facultyDao = DaoFactory.getSubject_assigned_to_facultyDao();
		if(subject_assigned_to_facultyDao!=null)
			msg = subject_assigned_to_facultyDao.deleteSubject_assigned_to_faculty(id);
		return msg;
	}

	@Override
	public String updateSubject_assigned_to_faculty(Subject_assigned_to_faculty subject_assigned_to_faculty) {
		subject_assigned_to_facultyDao = DaoFactory.getSubject_assigned_to_facultyDao();
		if(subject_assigned_to_facultyDao!=null)
			msg = subject_assigned_to_facultyDao.updateSubject_assigned_to_faculty(subject_assigned_to_faculty);
		return msg;
	}

	@Override
	public Subject_assigned_to_faculty selectSubject_assigned_to_faculty() {
		Subject_assigned_to_faculty Subject_assigned_to_faculty = null;
		subject_assigned_to_facultyDao = DaoFactory.getSubject_assigned_to_facultyDao();
		if(subject_assigned_to_facultyDao!=null)
			Subject_assigned_to_faculty = subject_assigned_to_facultyDao.selectSubject_assigned_to_faculty();
		return Subject_assigned_to_faculty;
	}

}
