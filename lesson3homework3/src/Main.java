import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.BaseLogger;
import core.logging.DatabaseLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbsInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseLogger[] loggers = {new DatabaseLogger()};

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(new Category(1, "Program"));
		categoryManager.add(new Category(2, "Data analitika"));
	
		System.out.println("----------------------------------------------------------------");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(new Course(1, "Java", 200));
		courseManager.add(new Course(2, "html", 100));
		
		System.out.println("----------------------------------------------------------------");

		InstructorManager instructorManager = new InstructorManager(new JdbsInstructorDao(), loggers);
		instructorManager.add(new Instructor(1, "Engin", "Demirog"));
		instructorManager.add(new Instructor(2, "Parviz", "Papaxov"));
	}

}
