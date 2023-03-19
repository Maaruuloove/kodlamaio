package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.BaseLogger;
import dataAccess.ICourseDao;
import entities.Course;

public class CourseManager {

	
	private BaseLogger[] loggers;
	private ICourseDao courseDao;
	private List<Course> courses = new ArrayList<>();

	public CourseManager() {

	}

	public CourseManager(ICourseDao courseDao, BaseLogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
	

	

		for (Course course2 : courses) {

			if (course2.getCourseName() == course.getCourseName())
				throw new Exception("Kurs ismi tekrar edemez");

		}

		if (course.getPrice() <= 0) {
			throw new Exception("Kursun fiyatýný yalnýþ girdiniz.");

		}

		courseDao.add(course);

		for (BaseLogger logger : loggers) {
			logger.log();
		}
		courses.add(course);
	}
}
