package in.vikash.dto;

import java.io.Serializable;

public class Faculty_enrolled_with_class implements Serializable{
	Integer id;
    Integer fac_id;
    Integer class_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFac_id() {
		return fac_id;
	}
	public void setFac_id(Integer fac_id) {
		this.fac_id = fac_id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
}
