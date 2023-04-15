package in.vikash.dto;

import java.io.Serializable;

public class Assign_attendance_sub_to_student implements Serializable{
	Integer id ;
    Integer std_id;
    Integer sub_id;
    Integer total_classes_held;
    Integer total_attended;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStd_id() {
		return std_id;
	}
	public void setStd_id(Integer std_id) {
		this.std_id = std_id;
	}
	public Integer getSub_id() {
		return sub_id;
	}
	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}
	public Integer getTotal_classes_held() {
		return total_classes_held;
	}
	public void setTotal_classes_held(Integer total_classes_held) {
		this.total_classes_held = total_classes_held;
	}
	public Integer getTotal_attended() {
		return total_attended;
	}
	public void setTotal_attended(Integer total_attended) {
		this.total_attended = total_attended;
	}
}
