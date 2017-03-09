package cn.edu.zut.personalBlog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.CategoryDao;
import cn.edu.zut.personalBlog.entity.Category;
import cn.edu.zut.personalBlog.service.CategoryService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao; 
	@Override
	public ResultDo insertCategory(Category category) {
		ResultDo resultDo = new ResultDo<>();
		int succ = 0;
		if (category != null && category.getCa_name() != null){
			succ = categoryDao.addCatById(category);
			resultDo.setResult(succ);
			resultDo.setSuccess(true);
		}else{
			resultDo.setMessage("插入失败");
		}
		return resultDo;
	}

	@Override
	public ResultDo selectCategory() {
		ResultDo resultDo = new ResultDo<>();
		List<Category> list = new ArrayList();
		list = categoryDao.selectAllCat();
		if (list.size() != 0){
			resultDo.setResult(list);
			resultDo.setSuccess(true);
		}else{
			resultDo.setMessage("查询失败");
		}
		return resultDo;
	}

	@Override
	public ResultDo getCategoryById(int id) {
		ResultDo resultDo = new ResultDo<>();
		Category category = new Category();
		return null;
	}

}
