package in.vikash.dto;

import java.io.Serializable;

public class Classes implements Serializable{
	Integer class_id ;
    String class_name ;
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
}
