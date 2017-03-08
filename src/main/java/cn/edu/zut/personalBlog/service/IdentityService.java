package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.entity.Identity;

public interface IdentityService {
	
	/**
	 * 根据博主的id进行更新该博主的个人信息
	 * @param id
	 * @return
	 */
	public int updateIdenity(int id);
	
	/**
	 * 根据博主的id查询出该博主的所有个人信息
	 * @param id
	 * @return
	 */
	public Identity getIdentity(int id);

}
