package business;

import java.util.ArrayList;
import java.util.List;

import core.logging.BaseLogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {

	BaseLogger[] loggers;
	ICategoryDao categoryDao;
	private List<Category> categories = new ArrayList<>();

	public CategoryManager() {

	}

	public CategoryManager(ICategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		for (Category category2 : categories) {
			if (category2.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}

		if (category.getCategoryName().isEmpty()) {
			throw new Exception("Kategori ismi girmediniz");
		}

		categoryDao.add(category);

		for (BaseLogger logger : loggers) {
			logger.log();
		}
		categories.add(category);
	}

}
