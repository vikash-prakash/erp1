package in.vikash.service;

import in.vikash.dto.Faculty;

public interface IFacultyService {
	public String addFaculty(Faculty faculty);
	public String deleteFaculty(Integer fac_id);
	public String updateFaculty(Faculty faculty);
	public Faculty selectFaculty();
}
