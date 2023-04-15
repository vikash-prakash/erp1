package in.vikash.dto;
import java.io.Serializable;
public class Subject_assigned_to_faculty implements Serializable{
	Integer id ;
    Integer fac_id ;
    Integer sub_id ;
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
	public Integer getSub_id() {
		return sub_id;
	}
	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}
}
