package in.vikash.dao;


import in.vikash.dto.Departments;

public interface IDepartmentsDao {
	public String addDepartment(Departments department);
	public String deleteDepartment(Integer dep_id );
	public String updateDepartment(Departments department);
	public Departments selectDepartment();
}
