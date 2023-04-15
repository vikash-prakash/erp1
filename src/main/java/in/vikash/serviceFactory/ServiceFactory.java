package in.vikash.serviceFactory;



import in.vikash.service.*;



public class ServiceFactory {
	private ServiceFactory(){}
	static IAdminService adminService =  null;
	static IClassesService classesService = null;
	static IAssign_attendance_sub_to_studentService assign_attendance_sub_to_studentService= null;
	static ICourseService courseService = null;
	static IDepartmentsService departmentsService = null;
	static IEnrolled_course_with_departmentService enrolled_course_with_departmentService = null;
	static IEnrolled_hod_with_departmentService enrolled_hod_with_departmentService = null;
	static IEnrolled_student_with_classService enrolled_student_with_classService = null;
	static IFaculty_enrolled_with_classService faculty_enrolled_with_classService = null; 
	static IFacultyService facultyService = null;
	static IHodService hodService = null;
	static IStudentService studentService = null;
	static ISubject_assigned_to_classService subject_assigned_to_classService = null;
	static ISubject_assigned_to_facultyService subject_assigned_to_facultyService = null;
	static ISubjectService subjectService = null;
	
	public static IAdminService getAdminService() {
		if(adminService==null)
			adminService = new IAdminServiceImpl();
		return adminService;
	}
	
	public static IClassesService getClassesService() {
		if(classesService==null)
			classesService = new IClassesServiceImpl();
		return classesService;
	}
	
	public static IAssign_attendance_sub_to_studentService getAssign_attendance_sub_to_studentService() {
		if(assign_attendance_sub_to_studentService == null)
			assign_attendance_sub_to_studentService = new IAssign_attendance_sub_to_studentServiceImpl();
		return assign_attendance_sub_to_studentService;
	}
	
	public static ICourseService getCourseService() {
		if(courseService == null)
			courseService = new ICourseServiceImpl();
		return courseService;
	}
	
	public static IDepartmentsService getDepartmentsService() {
		if(departmentsService == null)
			departmentsService = new IDepartmentsServiceImpl();
		return departmentsService;
	}
	
	public static IEnrolled_course_with_departmentService getEnrolled_course_with_departmentService() {
		if(enrolled_course_with_departmentService == null)
			enrolled_course_with_departmentService = new IEnrolled_course_with_departmentServiceImpl();
		return enrolled_course_with_departmentService;
	}
	
	public static IEnrolled_hod_with_departmentService getEnrolled_hod_with_departmentService() {
		if(enrolled_hod_with_departmentService == null)
			enrolled_hod_with_departmentService = new IEnrolled_hod_with_departmentServiceImpl();
		return enrolled_hod_with_departmentService;
	}
	
	public static IEnrolled_student_with_classService getEnrolled_student_with_classService() {
		if(enrolled_student_with_classService == null)
			enrolled_student_with_classService = new IEnrolled_student_with_classServiceImpl();
		return enrolled_student_with_classService;
	}
	
	public static IFaculty_enrolled_with_classService getFaculty_enrolled_with_classService() {
		if(faculty_enrolled_with_classService == null)
			faculty_enrolled_with_classService = new IFaculty_enrolled_with_classServiceImpl();
		return faculty_enrolled_with_classService;
	}
	
	public static IFacultyService getFacultyService() {
		if(facultyService == null)
			facultyService = new IFacultyServiceImpl();
		return facultyService;
	}
	
	public static IHodService getHodService() {
		if(hodService == null)
			hodService = new IHodServiceImpl();
		return hodService;
	}
	
	public static IStudentService getStudentService() {
		if(studentService == null)
			studentService = new IStudentServiceImpl();
		return studentService;
	}
	
	public static ISubject_assigned_to_classService getSubject_assigned_to_classService() {
		if(subject_assigned_to_classService == null)
			subject_assigned_to_classService = new ISubject_assigned_to_classServiceImpl();
		return subject_assigned_to_classService;
	}
	
	public static ISubject_assigned_to_facultyService getSubject_assigned_to_facultyService() {
		if(subject_assigned_to_facultyService  == null)
			subject_assigned_to_facultyService = new ISubject_assigned_to_facultyServiceImpl();
		return subject_assigned_to_facultyService;
			
	}
	public static ISubjectService getSubjectService() {
		if(subjectService == null)
			subjectService = new ISubjectServiceImpl();
		return subjectService;
	}
}
