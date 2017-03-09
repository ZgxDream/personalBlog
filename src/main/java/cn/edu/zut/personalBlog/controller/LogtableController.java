package cn.edu.zut.personalBlog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zut.personalBlog.entity.Logtable;
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
	/**
	 * 进入添加博客页
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping("addBlog")
	 public String addBlog(HttpSession session,Model model){
		return "./createBlog";
	}
	/**
	 * 添加博客
	 * @param session
	 * @param model
	 * @param title
	 * @param type_id
	 * @param centent
	 * @return
	 */
	@RequestMapping("toAddBlog")
	 public String toAddBlog(HttpSession session,Model model,
			 @RequestParam("title") String title,@RequestParam("categary_id") Integer type_id,
			 @RequestParam("centent") String centent){
		ResultDo resultDo = new ResultDo();
		resultDo = logtableService.insertLogtable(title,  type_id, centent);
		return "./createBlog";
	}
	/**
	 * 删除博客
	 */
//	@RequestMapping("deleteBlog")
//	 public String deleteBlog(HttpSession session,Model model,
//		@RequestParam("blog_id") Integer blog_id){
//		ResultDo resultDo = new ResultDo();
//		resultDo = logtableService.
//		return "./createBlog";
//	}
	/**
	 * 查看博客
	 * @param session
	 * @param model
	 * @param blog_id
	 * @return
	 */
	@RequestMapping("myBlog")
	 public String selectBlog(HttpSession session,Model model,
		@RequestParam("blog_id") Integer blog_id){
		ResultDo resultDo = new ResultDo();
		resultDo = logtableService.getLogtable(blog_id);
		if(resultDo.isSuccess()){
			Logtable logtable = (Logtable) resultDo.getResult();
			model.addAttribute("logtable", logtable);
		}else{
			
		}
		return "./myBlog";
	}

}
