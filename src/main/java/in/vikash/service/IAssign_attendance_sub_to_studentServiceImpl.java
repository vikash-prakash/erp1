package in.vikash.service;

import in.vikash.dao.IAssign_attendance_sub_to_studentDao;
import in.vikash.daoFactory.DaoFactory;
import in.vikash.dto.Assign_attendance_sub_to_student;

public class IAssign_attendance_sub_to_studentServiceImpl implements IAssign_attendance_sub_to_studentService {
	IAssign_attendance_sub_to_studentDao assign_attendance_sub_to_studentDao = null;
	String msg = null;
	@Override
	public String addAssign_attendance_sub_to_student(
			Assign_attendance_sub_to_student assign_attendance_sub_to_student) {
		assign_attendance_sub_to_studentDao = DaoFactory.getAssign_attendance_sub_to_studentDao();
		if(assign_attendance_sub_to_studentDao != null)
			msg = assign_attendance_sub_to_studentDao.addAssign_attendance_sub_to_student(assign_attendance_sub_to_student);
		
		return msg;
	}

	@Override
	public String deleteAssign_attendance_sub_to_student(Integer id) {
		assign_attendance_sub_to_studentDao = DaoFactory.getAssign_attendance_sub_to_studentDao();
		if(assign_attendance_sub_to_studentDao !=  null)
			msg = assign_attendance_sub_to_studentDao.deleteAssign_attendance_sub_to_student(id);
		return msg;
	}

	@Override
	public String updateAssign_attendance_sub_to_student(
			Assign_attendance_sub_to_student ssign_attendance_sub_to_student) {
		assign_attendance_sub_to_studentDao = DaoFactory.getAssign_attendance_sub_to_studentDao();
		if(assign_attendance_sub_to_studentDao!= null)
			msg = assign_attendance_sub_to_studentDao.updateAssign_attendance_sub_to_student(ssign_attendance_sub_to_student);
		return msg;
	}

	@Override
	public Assign_attendance_sub_to_student selectAssign_attendance_sub_to_student() {
		Assign_attendance_sub_to_student assign_attendance_sub_to_student = null;
		assign_attendance_sub_to_studentDao = DaoFactory.getAssign_attendance_sub_to_studentDao();
		if(assign_attendance_sub_to_studentDao != null)
			assign_attendance_sub_to_student = assign_attendance_sub_to_studentDao.selectAssign_attendance_sub_to_student();
		return assign_attendance_sub_to_student;
	}

}
