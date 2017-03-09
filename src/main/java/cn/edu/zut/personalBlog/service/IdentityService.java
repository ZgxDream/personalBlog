package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.supervisor.ResultDo;

public interface IdentityService {
	
	/**
	 * 根据博主的id进行更新该博主的个人信息
	 * @param id
	 * @return
	 */
	ResultDo updateIdenity(Identity identity);
	
	/**
	 * 根据博主的id查询出该博主的所有个人信息
	 * @param id
	 * @return
	 */
	ResultDo getIdentity(int id);

}
