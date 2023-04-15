package in.vikash.service;

import java.util.ArrayList;

import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dao.IStudentDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Student;

public class IStudentServiceImpl implements IStudentService {
	private IStudentDao studentDao = null;
	private String msg =  null;
	@Override
	public String addStudent(Student student) throws PoolInitializationException{
		studentDao = DaoFactory.getStudentDao();
		if(studentDao!=null)
			msg  = studentDao.addStudent(student);
		return msg;
	}

	@Override
	public String deleteStudent(Integer std_id) {
		studentDao = DaoFactory.getStudentDao();
		if(studentDao!=null)
			msg  = studentDao.deleteStudent(std_id);
		return msg;
	}

	@Override
	public String updateStudent(Student student) {
		studentDao = DaoFactory.getStudentDao();
		if(studentDao!=null)
			msg  = studentDao.updateStudent(student);
		return msg;
	}

	@Override
	public ArrayList<Student> selectStudent() {
		ArrayList<Student> student = null;
		studentDao = DaoFactory.getStudentDao();
		if(studentDao!=null)
			student = studentDao.selectStudent();
		return student;
	}

	@Override
	public Student selectStudentForGivenId(Integer std_id) {
		Student student = null;
		studentDao = DaoFactory.getStudentDao();
		if(studentDao!=null) {
			student = studentDao.selectStudentForGivenId(std_id);
		}
		return student;
	}

}
