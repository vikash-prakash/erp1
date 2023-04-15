package in.vikash.service;

import in.vikash.dto.Hod;

public interface IHodService {
	public String addHod(Hod hod);
	public String deleteHod(Integer hod_id);
	public String updateHod(Hod hod);
	public Hod selectHod();
}
