package in.vikash.dto;

import java.io.Serializable;

public class Departments implements Serializable{
	Integer dep_id ;
    String dep_name;
	public Integer getDep_id() {
		return dep_id;
	}
	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
    
    
}
