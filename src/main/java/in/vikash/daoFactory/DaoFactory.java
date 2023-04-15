package in.vikash.daoFactory;

import in.vikash.dao.IAdminDao;
import in.vikash.dao.IAdminDaoImpl;
import in.vikash.dao.IAssign_attendance_sub_to_studentDao;
import in.vikash.dao.IAssign_attendance_sub_to_studentDaoImpl;
import in.vikash.dao.IClassesDao;
import in.vikash.dao.IClassesDaoImpl;
import in.vikash.dao.ICourseDao;
import in.vikash.dao.ICourseDaoImpl;
import in.vikash.dao.IDepartmentsDao;
import in.vikash.dao.IDepartmentsDaoImpl;
import in.vikash.dao.IEnrolled_course_with_departmentDao;
import in.vikash.dao.IEnrolled_course_with_departmentDaoImpl;
import in.vikash.dao.IEnrolled_hod_with_departmentDao;
import in.vikash.dao.IEnrolled_hod_with_departmentDaoImpl;
import in.vikash.dao.IEnrolled_student_with_classDao;
import in.vikash.dao.IEnrolled_student_with_classDaoImpl;
import in.vikash.dao.IFacultyDao;
import in.vikash.dao.IFacultyDaoImpl;
import in.vikash.dao.IFaculty_enrolled_with_classDao;
import in.vikash.dao.IFaculty_enrolled_with_classDaoImpl;
import in.vikash.dao.IHodDao;
import in.vikash.dao.IHodDaoImpl;
import in.vikash.dao.IStudentDao;
import in.vikash.dao.IStudentDaoImpl;
import in.vikash.dao.ISubjectDao;
import in.vikash.dao.ISubjectDaoImpl;
import in.vikash.dao.ISubject_assigned_to_classDao;
import in.vikash.dao.ISubject_assigned_to_classDaoImpl;
import in.vikash.dao.ISubject_assigned_to_facultyDao;
import in.vikash.dao.ISubject_assigned_to_facultyDaoImpl;

public class DaoFactory {
	private DaoFactory(){}
	static IAdminDao adminDao =  null;
	static IClassesDao classesDao = null;
	static IAssign_attendance_sub_to_studentDao assign_attendance_sub_to_studentDao= null;
	static ICourseDao courseDao = null;
	static IDepartmentsDao departmentsDao = null;
	static IEnrolled_course_with_departmentDao enrolled_course_with_departmentDao = null;
	static IEnrolled_hod_with_departmentDao enrolled_hod_with_departmentDao = null;
	static IEnrolled_student_with_classDao enrolled_student_with_classDao = null;
	static IFaculty_enrolled_with_classDao faculty_enrolled_with_classDao = null; 
	static IFacultyDao facultyDao = null;
	static IHodDao hodDao = null;
	static IStudentDao studentDao = null;
	static ISubject_assigned_to_classDao subject_assigned_to_classDao = null;
	static ISubject_assigned_to_facultyDao subject_assigned_to_facultyDao = null;
	static ISubjectDao subjectDao = null;
	
	public static IAdminDao getAdminDao() {
		if(adminDao==null)
			adminDao = new IAdminDaoImpl();
		return adminDao;
	}
	
	public static IClassesDao getClassesDao() {
		if(classesDao==null)
			classesDao = new IClassesDaoImpl();
		return classesDao;
	}
	
	public static IAssign_attendance_sub_to_studentDao getAssign_attendance_sub_to_studentDao() {
		if(assign_attendance_sub_to_studentDao == null)
			assign_attendance_sub_to_studentDao = new IAssign_attendance_sub_to_studentDaoImpl();
		return assign_attendance_sub_to_studentDao;
	}
	
	public static ICourseDao getCourseDao() {
		if(courseDao == null)
			courseDao = new ICourseDaoImpl();
		return courseDao;
	}
	
	public static IDepartmentsDao getDepartmentsDao() {
		if(departmentsDao == null)
			departmentsDao = new IDepartmentsDaoImpl();
		return departmentsDao;
	}
	
	public static IEnrolled_course_with_departmentDao getEnrolled_course_with_departmentDao() {
		if(enrolled_course_with_departmentDao == null)
			enrolled_course_with_departmentDao = new IEnrolled_course_with_departmentDaoImpl();
		return enrolled_course_with_departmentDao;
	}
	
	public static IEnrolled_hod_with_departmentDao getEnrolled_hod_with_departmentDao() {
		if(enrolled_hod_with_departmentDao == null)
			enrolled_hod_with_departmentDao = new IEnrolled_hod_with_departmentDaoImpl();
		return enrolled_hod_with_departmentDao;
	}
	
	public static IEnrolled_student_with_classDao getEnrolled_student_with_classDao() {
		if(enrolled_student_with_classDao == null)
			enrolled_student_with_classDao = new IEnrolled_student_with_classDaoImpl();
		return enrolled_student_with_classDao;
	}
	
	public static IFaculty_enrolled_with_classDao getFaculty_enrolled_with_classDao() {
		if(faculty_enrolled_with_classDao == null)
			faculty_enrolled_with_classDao = new IFaculty_enrolled_with_classDaoImpl();
		return faculty_enrolled_with_classDao;
	}
	
	public static IFacultyDao getFacultyDao() {
		if(facultyDao == null)
			facultyDao = new IFacultyDaoImpl();
		return facultyDao;
	}
	
	public static IHodDao getHodDao() {
		if(hodDao == null)
			hodDao = new IHodDaoImpl();
		return hodDao;
	}
	
	public static IStudentDao getStudentDao() {
		if(studentDao == null)
			studentDao = new IStudentDaoImpl();
		return studentDao;
	}
	
	public static ISubject_assigned_to_classDao getSubject_assigned_to_classDao() {
		if(subject_assigned_to_classDao == null)
			subject_assigned_to_classDao = new ISubject_assigned_to_classDaoImpl();
		return subject_assigned_to_classDao;
	}
	
	public static ISubject_assigned_to_facultyDao getSubject_assigned_to_facultyDao() {
		if(subject_assigned_to_facultyDao  == null)
			subject_assigned_to_facultyDao = new ISubject_assigned_to_facultyDaoImpl();
		return subject_assigned_to_facultyDao;
			
	}
	public static ISubjectDao getSubjectDao() {
		if(subjectDao == null)
			subjectDao = new ISubjectDaoImpl();
		return subjectDao;
	}
}
