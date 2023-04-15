package in.vikash.service;

import in.vikash.dto.Subject_assigned_to_class;

public interface ISubject_assigned_to_classService {
	public String addSubject_assigned_to_class(Subject_assigned_to_class subject_assigned_to_class);
	public String deleteSubject_assigned_to_class(Integer id);
	public String updateSubject_assigned_to_class(Subject_assigned_to_class subject_assigned_to_class);
	public Subject_assigned_to_class selectSubject_assigned_to_class();
}
