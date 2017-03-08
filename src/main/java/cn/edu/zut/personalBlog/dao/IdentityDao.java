package cn.edu.zut.personalBlog.dao;

import cn.edu.zut.personalBlog.entity.Identity;

public interface IdentityDao {
    
	Identity getBlogByemail(String email, String pwd);
     
	
	
	 /*
	 * 添加博主信息
	 */
	 int insert (Identity indentity);
	 /**
	  * 查看博主个人信息
	  * @param id
	  * @return
	  */
	 Identity selectInfoById(int id);
	 /**
	  * 修改博主个人信息
	  * @param id
	  * @return
	  */
     int updateIdentity(Identity identity);
     /**
 	 * 查找信息
 	 * @param indentity
 	 * @return
 	 */
     Identity select(String name);
     
}
