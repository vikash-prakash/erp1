package in.vikash.dao;

import in.vikash.dto.Faculty_enrolled_with_class;

public interface IFaculty_enrolled_with_classDao {
	public String addFaculty_enrolled_with_class(Faculty_enrolled_with_class faculty_enrolled_with_class);
	public String deleteFaculty_enrolled_with_class(Integer id);
	public String updateFaculty_enrolled_with_class(Faculty_enrolled_with_class faculty_enrolled_with_class);
	public Faculty_enrolled_with_class selectFaculty_enrolled_with_class();
}
