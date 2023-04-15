package in.vikash.service;

import in.vikash.dao.ISubjectDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Subject;

public class ISubjectServiceImpl implements ISubjectService {
	private ISubjectDao subjectDao =  null;
	private String msg = null;
	@Override
	public String addSubject(Subject subject) {
		 subjectDao = DaoFactory.getSubjectDao();
		 if(subjectDao != null)
			 msg  = subjectDao.addSubject(subject);
		return msg;
	}

	@Override
	public String deleteSubject(Integer sub_id) {
		 subjectDao = DaoFactory.getSubjectDao();
		 if(subjectDao != null)
			 msg  = subjectDao.deleteSubject(sub_id);
		return msg;
	}

	@Override
	public String updateSubject(Subject subject) {
		 subjectDao = DaoFactory.getSubjectDao();
		 if(subjectDao != null)
			 msg  = subjectDao.updateSubject(subject);
		return msg;
	}

	@Override
	public Subject selectSubject() {
		Subject subject = null;
		 subjectDao = DaoFactory.getSubjectDao();
		 if(subjectDao != null)
			subject = subjectDao.selectSubject();
		return subject;
	}

}
