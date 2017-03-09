package cn.edu.zut.personalBlog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zut.personalBlog.entity.Category;
import cn.edu.zut.personalBlog.service.CategoryService;
import cn.edu.zut.personalBlog.service.LogtableService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;

/**
 * 该控制层主要是用于博主的博客浏览和输入等 
 * @author me
 *
 */
@Controller
@RequestMapping("/")
public class LogtableController {
	
	
	@Resource
	public CategoryService categoryService;
	
	@Resource
	public LogtableService logtableService;	
	
	@RequestMapping("addBlog")
	 public String addBlog(HttpSession session,Model model){
		return "./createBlog";
	}
	@RequestMapping("toAddBlog")
	 public String toAddBlog(HttpSession session,Model model,
			 @RequestParam("title") String title,@RequestParam("categary_id") Integer type_id,
			 @RequestParam("centent") String centent){
		ResultDo resultDo = new ResultDo();
		System.out.println(title);
		System.out.println(type_id);
		System.out.println(centent);
		resultDo = logtableService.insertLogtable(title,  type_id, centent);
		return "./createBlog";
	}

}
