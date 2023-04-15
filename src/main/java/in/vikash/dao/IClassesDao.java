package in.vikash.dao;


import in.vikash.dto.Classes;

public interface IClassesDao {
	public String addClass(Classes classes);
	public String deleteClass(Integer class_id );
	public String updateUpdate(Classes classes);
	public Classes selectClass();
}
