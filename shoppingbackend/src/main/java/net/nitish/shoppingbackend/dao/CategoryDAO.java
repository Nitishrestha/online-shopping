package net.nitish.shoppingbackend.dao;

import java.util.List;

import net.nitish.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);
}
