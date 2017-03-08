package cn.edu.zut.personalBlog.dao;

import org.springframework.stereotype.Repository;

import cn.edu.zut.personalBlog.entity.Identity;
@Repository
public interface IdentityDao {
	
	public Identity getBlogByemail(String email,String pwd);
	
	/*
	 * 添加博主信息
	 */
	public int insert (Identity indentity);
	
	
	

	
	

}
