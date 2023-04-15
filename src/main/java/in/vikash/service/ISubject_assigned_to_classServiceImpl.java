package in.vikash.service;

import in.vikash.dao.ISubject_assigned_to_classDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Subject_assigned_to_class;

public class ISubject_assigned_to_classServiceImpl implements ISubject_assigned_to_classService {
	private ISubject_assigned_to_classDao subject_assigned_to_classDao = null;
	private String msg;
	@Override
	public String addSubject_assigned_to_class(Subject_assigned_to_class subject_assigned_to_class) {
		subject_assigned_to_classDao = DaoFactory.getSubject_assigned_to_classDao();
		if(subject_assigned_to_classDao!=null)
			msg =  subject_assigned_to_classDao.addSubject_assigned_to_class(subject_assigned_to_class);
		return msg;
	}

	@Override
	public String deleteSubject_assigned_to_class(Integer id) {
		subject_assigned_to_classDao = DaoFactory.getSubject_assigned_to_classDao();
		if(subject_assigned_to_classDao!=null)
			msg =  subject_assigned_to_classDao.deleteSubject_assigned_to_class(id);
		return msg;
	}

	@Override
	public String updateSubject_assigned_to_class(Subject_assigned_to_class subject_assigned_to_class) {
		subject_assigned_to_classDao = DaoFactory.getSubject_assigned_to_classDao();
		if(subject_assigned_to_classDao!=null)
			msg =  subject_assigned_to_classDao.updateSubject_assigned_to_class(subject_assigned_to_class);
		return msg;
	}

	@Override
	public Subject_assigned_to_class selectSubject_assigned_to_class() {
		Subject_assigned_to_class subject_assigned_to_class = null;
		subject_assigned_to_classDao = DaoFactory.getSubject_assigned_to_classDao();
		if(subject_assigned_to_classDao!=null)
			subject_assigned_to_class =  subject_assigned_to_classDao.selectSubject_assigned_to_class();
		return subject_assigned_to_class;
	}

}
