package dataAccess;

import entities.Course;

public class JbdsCourseDao implements ICourseDao {


	public void add(Course course) {
		System.out.println(course.getCourseName() +  " adl� kurs JBDC ile veritaban�na eklendi.");
		
	}


}
