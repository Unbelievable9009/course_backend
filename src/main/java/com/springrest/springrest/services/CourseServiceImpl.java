package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;



@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
	}
	
	@Override
	public List<Course> getCourse() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.getReferenceById(courseId);
	}
	
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	
	 public void deleteCourse(long parseLong) {
		 Course entity= courseDao.getReferenceById(parseLong);
		 courseDao.delete(entity);
	 }

}
