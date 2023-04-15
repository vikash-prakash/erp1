package in.vikash.service;

import in.vikash.dao.ICourseDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Course;

public class ICourseServiceImpl implements ICourseService {
	private ICourseDao courseDao = null;
	private String msg=null;
	@Override
	public String addCourse(Course course) {
		courseDao = DaoFactory.getCourseDao();
		if(courseDao!= null)
			msg = courseDao.addCourse(course);
		return msg;
	}

	@Override
	public String deleteCourse(Integer course_id) {
		courseDao = DaoFactory.getCourseDao();
		if(courseDao!=null)
			msg = courseDao.deleteCourse(course_id);
		return msg;
	}

	@Override
	public String updateCourse(Course course) {
		courseDao = DaoFactory.getCourseDao();
		if(courseDao!=null)
			msg = courseDao.updateCourse(course);
		return msg;
	}

	@Override
	public Course selectCourse() {
		Course course = null;
		courseDao = DaoFactory.getCourseDao();
		if(courseDao!=null)
			course = courseDao.selectCourse();
		return course;
	}

}
