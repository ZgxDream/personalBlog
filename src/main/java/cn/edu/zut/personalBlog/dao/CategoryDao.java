package cn.edu.zut.personalBlog.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.zut.personalBlog.entity.Category;

@Repository
public interface CategoryDao {
 /**
  * 增加类别
  */
	int addCatById(Category category);
	
	/**
	 * 删除类别
	 */
	int deleteCateById(int id);
	/**
	 * 查看全部类别
	 * @param id
	 * @return
	 */
	List<Category> selectAllCat();
	/**
	 * 修改类别
	 */
	int updateBlogById(Category category);
}
