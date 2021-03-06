package net.nitish.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.nitish.shoppingbackend.dao.CategoryDAO;
import net.nitish.shoppingbackend.dto.Category;

/*
 * to remove the problem in using @Repository
 * we should add Spring Context Dependency on backend pom.xml
 * */

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a television");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a mobile");
		category.setImageURL("CAT_2.png");

		//second category added
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a laptop");
		category.setImageURL("CAT_3.png");
		
		//third category added
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories)
		{
			if(category.getId() == id) return category;
		}
		return null;
	}

}
