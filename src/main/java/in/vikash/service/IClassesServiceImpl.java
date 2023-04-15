package in.vikash.service;

import in.vikash.dao.IClassesDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Classes;

public class IClassesServiceImpl implements IClassesService {
	IClassesDao classesDao = null;
	String msg = null;
	@Override
	public String addClass(Classes classes) {
		classesDao = DaoFactory.getClassesDao();
		if(classesDao != null)
			msg = classesDao.addClass(classes);
		return msg;
	}

	@Override
	public String deleteClass(Integer class_id) {
		classesDao = DaoFactory.getClassesDao();
		if(classesDao != null)
			msg = classesDao.deleteClass(class_id);
		return msg;
	}

	@Override
	public String updateUpdate(Classes classes) {
		classesDao = DaoFactory.getClassesDao();
		if(classesDao!=null)
			msg = classesDao.updateUpdate(classes);
		
		return msg;
	}

	@Override
	public Classes selectClass() {
		Classes classes = null;
		classesDao = DaoFactory.getClassesDao();
		if(classesDao!=null)
			classes = classesDao.selectClass();
		return classes;
	}

}
