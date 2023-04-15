package in.vikash.dto;

import java.io.Serializable;

public class Enrolled_hod_with_department implements Serializable{
	Integer id ;
    Integer hod_id;
    Integer dep_id;
    String hod_enrolled_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHod_id() {
		return hod_id;
	}
	public void setHod_id(Integer hod_id) {
		this.hod_id = hod_id;
	}
	public Integer getDep_id() {
		return dep_id;
	}
	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}
	public String getHod_enrolled_date() {
		return hod_enrolled_date;
	}
	public void setHod_enrolled_date(String hod_enrolled_date) {
		this.hod_enrolled_date = hod_enrolled_date;
	}
}
