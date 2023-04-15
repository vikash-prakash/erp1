package in.vikash.dao;

import in.vikash.dto.Hod;

public interface IHodDao {
	public String addHod(Hod hod);
	public String deleteHod(Integer hod_id);
	public String updateHod(Hod hod);
	public Hod selectHod();
}
