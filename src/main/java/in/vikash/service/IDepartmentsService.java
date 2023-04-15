package in.vikash.service;

import in.vikash.dto.Departments;

public interface IDepartmentsService {
	public String addDepartment(Departments department);
	public String deleteDepartment(Integer dep_id );
	public String updateDepartment(Departments department);
	public Departments selectDepartment();
}
