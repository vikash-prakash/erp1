package in.vikash.service;

import in.vikash.dto.Classes;

public interface IClassesService {
	public String addClass(Classes classes);
	public String deleteClass(Integer class_id );
	public String updateUpdate(Classes classes);
	public Classes selectClass();
}
