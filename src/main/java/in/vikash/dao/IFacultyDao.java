package in.vikash.dao;

import in.vikash.dto.Faculty;

public interface IFacultyDao {
	public String addFaculty(Faculty faculty);
	public String deleteFaculty(Integer fac_id);
	public String updateFaculty(Faculty faculty);
	public Faculty selectFaculty();
}
