package dataAccess;

import entities.Instructor;

public class HibernateInstuctorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(
				"��retmen " + instructor.getName() + " " + instructor.getSurname() + " Hibernate ile veritaban�na eklendi");
		
	}

}
