package dataAccess;

import entities.Instructor;

public class JdbsInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(
				"Öðretmen " + instructor.getName() + " " + instructor.getSurname() + " Jbds ile veritabanýna eklendi");

	}

}
