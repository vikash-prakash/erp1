package in.vikash.service;

import in.vikash.dto.Subject;

public interface ISubjectService {
	public String addSubject(Subject subject);
	public String deleteSubject(Integer sub_id);
	public String updateSubject(Subject subject);
	public Subject selectSubject();
}
