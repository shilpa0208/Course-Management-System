package io.courseapi.springbootstarter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import io.courseapi.springbootstarter.model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId); 
}
