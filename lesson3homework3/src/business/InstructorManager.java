package business;

import core.logging.BaseLogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
	IInstructorDao instructorDao;
	
	BaseLogger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao,BaseLogger[] loggers) {
		this.loggers = loggers;
		this.instructorDao = instructorDao;
		
	}
	public void add(Instructor instructor) throws Exception{
	
		


		if (instructor.getName().isEmpty() && instructor.getSurname().isEmpty()) {
			throw new Exception("Eðitmen ismi ve soyadi girmediniz.");

		}
		else if (instructor.getSurname().isEmpty()) {
			throw new Exception("Egitmen soyadi girmediniz");
			}
		else if (instructor.getName().isEmpty()) {
			throw new Exception("Egitmen adi girmediniz");
			}
		
		

		
		else {
			instructorDao.add(instructor);

		for (BaseLogger logger : loggers) {
			logger.log();
		}
	}
	
	
	}
}
