package cn.edu.zut.personalBlog.dao;

import cn.edu.zut.personalBlog.entity.Identity;

public interface IdentityDao {

	Identity getBlogByemail(String email, String pwd);

	// /*
	// * 添加博主信息
	// */
	// int insert (Identity indentity);

}
