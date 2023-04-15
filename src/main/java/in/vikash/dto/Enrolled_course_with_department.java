package in.vikash.dto;

import java.io.Serializable;

public class Enrolled_course_with_department implements Serializable{
	Integer id ;
    Integer course_id ;
    Integer dep_id ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Integer getDep_id() {
		return dep_id;
	}
	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}
    
    
}
