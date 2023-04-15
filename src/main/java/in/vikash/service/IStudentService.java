package in.vikash.service;

import java.util.ArrayList;

import com.zaxxer.hikari.pool.HikariPool.PoolInitializationException;

import in.vikash.dto.Student;

public interface IStudentService {
	public String addStudent(Student student)  throws PoolInitializationException;
	public String deleteStudent(Integer std_id);
	public String updateStudent(Student student);
	public ArrayList<Student> selectStudent() ;
	public Student selectStudentForGivenId(Integer std_id) ;
	
	
}
