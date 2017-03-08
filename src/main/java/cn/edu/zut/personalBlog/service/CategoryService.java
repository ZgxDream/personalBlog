package cn.edu.zut.personalBlog.service;

import java.util.List;

import cn.edu.zut.personalBlog.entity.Category;
/**
 * @author zgx
 */
public interface CategoryService {

	/**
	 * 添加类别
	 * @param category
	 * @return
	 */
	public int insertCategory(Category category);
	
	/**
	 * 得到全部的类别类型
	 * @return
	 */
	public List<Category> selectCategory();
	
	/**
	 * 根据i的查询到类别
	 * @param id
	 * @return
	 */
	public Category getCategoryById(int id);
}
