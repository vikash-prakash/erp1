package in.vikash.dao;

import java.util.ArrayList;

import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Student;

public interface IStudentDao {
	
	public String addStudent(Student std) throws PoolInitializationException;
	public String deleteStudent(Integer std_id);
	public String updateStudent(Student std);
	public ArrayList<Student> selectStudent();
	public Student selectStudentForGivenId(Integer std_id);
}
