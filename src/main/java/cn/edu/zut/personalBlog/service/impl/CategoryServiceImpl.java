package cn.edu.zut.personalBlog.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.entity.Category;
import cn.edu.zut.personalBlog.service.CategoryService;
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService{

	@Override
	public int insertCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> selectCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
