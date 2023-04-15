package in.vikash.service;

import in.vikash.dto.Course;

public interface ICourseService {
	public String addCourse(Course course);
	public String deleteCourse(Integer course_id );
	public String updateCourse(Course course);
	public Course selectCourse();
}
