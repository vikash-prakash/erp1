package in.vikash.service;

import in.vikash.dto.Subject_assigned_to_faculty;

public interface ISubject_assigned_to_facultyService {
	public String addSubject_assigned_to_faculty(Subject_assigned_to_faculty subject_assigned_to_faculty);
	public String deleteSubject_assigned_to_faculty(Integer id);
	public String updateSubject_assigned_to_faculty(Subject_assigned_to_faculty subject_assigned_to_faculty);
	public Subject_assigned_to_faculty selectSubject_assigned_to_faculty();
}
