package dataAccess;

import entities.Instructor;

public class HibernateInstuctorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(
				"Öğretmen " + instructor.getName() + " " + instructor.getSurname() + " Hibernate ile veritabanına eklendi");
		
	}

}
