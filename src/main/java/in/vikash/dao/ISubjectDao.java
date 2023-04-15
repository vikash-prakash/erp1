package in.vikash.dao;

import in.vikash.dto.Subject;

public interface ISubjectDao {
	public String addSubject(Subject subject);
	public String deleteSubject(Integer sub_id);
	public String updateSubject(Subject subject);
	public Subject selectSubject();
}
