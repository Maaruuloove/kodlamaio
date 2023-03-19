package dataAccess;

import entities.Instructor;

public class JdbsInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(
				"Öğretmen " + instructor.getName() + " " + instructor.getSurname() + " Jbds ile veritabanına eklendi");

	}

}
