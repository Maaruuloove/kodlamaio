package dataAccess;

import entities.Instructor;

public class JdbsInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(
				"��retmen " + instructor.getName() + " " + instructor.getSurname() + " Jbds ile veritaban�na eklendi");

	}

}
