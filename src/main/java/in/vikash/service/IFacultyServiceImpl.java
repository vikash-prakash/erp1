package in.vikash.service;

import in.vikash.dao.IFacultyDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Faculty;

public class IFacultyServiceImpl implements IFacultyService {
	private IFacultyDao facultyDao = null;
	private String msg = null;
	
	@Override
	public String addFaculty(Faculty faculty) {
		facultyDao = DaoFactory.getFacultyDao();
		if(facultyDao!=null)
			msg = facultyDao.addFaculty(faculty);
		return msg;
	}

	@Override
	public String deleteFaculty(Integer fac_id) {
		facultyDao = DaoFactory.getFacultyDao();
		if(facultyDao!=null)
			msg = facultyDao.deleteFaculty(fac_id);
		return msg;
	}

	@Override
	public String updateFaculty(Faculty faculty) {
		facultyDao = DaoFactory.getFacultyDao();
		if(facultyDao!=null)
			msg = facultyDao.updateFaculty(faculty);
		return msg;
	}

	@Override
	public Faculty selectFaculty() {
		Faculty faculty = null;
		facultyDao = DaoFactory.getFacultyDao();
		if(facultyDao!=null)
			faculty = facultyDao.selectFaculty();
		return faculty;
	}

}
