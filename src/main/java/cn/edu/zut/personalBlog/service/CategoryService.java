package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.entity.Category;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
/**
 * @author zgx
 */
public interface CategoryService {

	/**
	 * 添加类别
	 * @param category
	 * @return
	 */
	ResultDo insertCategory(Category category);
	
	/**
	 * 得到全部的类别类型
	 * @return
	 */
	ResultDo  selectCategory();
	
	/**
	 * 根据i的查询到类别
	 * @param id
	 * @return
	 */
	ResultDo  deletrCategoryById(int id);
}
