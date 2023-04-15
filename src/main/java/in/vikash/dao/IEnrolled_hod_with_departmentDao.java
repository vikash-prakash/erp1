package in.vikash.dao;

import in.vikash.dto.Enrolled_hod_with_department;

public interface IEnrolled_hod_with_departmentDao {
	public String addEnrolled_hod_with_department(Enrolled_hod_with_department enrolled_hod_with_department);
	public String deleteEnrolled_hod_with_department(Integer id);
	public String updateEnrolled_hod_with_department(Enrolled_hod_with_department enrolled_hod_with_department);
	public Enrolled_hod_with_department selectEnrolled_hod_with_department();
}
