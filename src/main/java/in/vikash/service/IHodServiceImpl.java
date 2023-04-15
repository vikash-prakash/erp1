package in.vikash.service;

import in.vikash.dao.IHodDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Hod;

public class IHodServiceImpl implements IHodService {
	private IHodDao hodDao = null;
	private String msg;
	@Override
	public String addHod(Hod hod) {
		hodDao = DaoFactory.getHodDao();
		if(hodDao !=null)
			msg = hodDao.addHod(hod);
		return msg;
	}

	@Override
	public String deleteHod(Integer hod_id) {
		hodDao = DaoFactory.getHodDao();
		if(hodDao !=null)
			msg = hodDao.deleteHod(hod_id);
		return msg;
	}

	@Override
	public String updateHod(Hod hod) {
		hodDao = DaoFactory.getHodDao();
		if(hodDao !=null)
			msg = hodDao.updateHod(hod);
		return msg;
	}

	@Override
	public Hod selectHod() {
		Hod hod = null;
		hodDao = DaoFactory.getHodDao();
		if(hodDao !=null)
			hod = hodDao.selectHod();
		return hod;
	}

}
