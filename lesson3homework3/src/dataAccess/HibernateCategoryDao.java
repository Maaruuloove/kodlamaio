package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	public HibernateCategoryDao() {
		
	}

	@Override
	public void add(Category category) {
	
		System.out.println(category.getCategoryName() + " adl� kategori hibernate ile veritaban�na eklendi.");
		
	}

}
