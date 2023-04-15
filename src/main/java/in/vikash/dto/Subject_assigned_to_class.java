package in.vikash.dto;

import java.io.Serializable;

public class Subject_assigned_to_class implements Serializable{
	   Integer id ;
	   Integer sub_id ;
	   Integer class_id ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSub_id() {
		return sub_id;
	}
	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
}
