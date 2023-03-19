package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	public HibernateCategoryDao() {
		
	}

	@Override
	public void add(Category category) {
	
		System.out.println(category.getCategoryName() + " adlý kategori hibernate ile veritabanýna eklendi.");
		
	}

}
