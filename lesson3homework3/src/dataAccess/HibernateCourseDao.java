package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() +  " adl� kurs Hibernate ile veritaban�na eklendi.");
		
	}

}
