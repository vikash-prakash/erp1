package in.vikash.dao;

import in.vikash.dto.Enrolled_student_with_class;

public interface IEnrolled_student_with_classDao {
	public String addEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class);
	public String deleteEnrolled_student_with_class(Integer id);
	public String updateEnrolled_student_with_class(Enrolled_student_with_class enrolled_student_with_class);
	public Enrolled_student_with_class selectEnrolled_student_with_class();
	public Enrolled_student_with_class selectEnrolled_student_with_classForGivenId(Integer id);

}
