package in.vikash.dto;

import java.io.Serializable;

public class Enrolled_student_with_class implements Serializable{
	Integer id ;
    Integer std_id;
    Integer class_id;
    String roll_no;
    String official_mail ;
    String std_password;
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
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getOfficial_mail() {
		return official_mail;
	}
	public void setOfficial_mail(String official_mail) {
		this.official_mail = official_mail;
	}
	public String getStd_password() {
		return std_password;
	}
	public void setStd_password(String std_password) {
		this.std_password = std_password;
	}
    
}
