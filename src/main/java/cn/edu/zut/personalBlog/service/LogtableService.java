package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.entity.Logtable;
import cn.edu.zut.personalBlog.supervisor.ResultDo;

public interface LogtableService {
	
	/**
	 * 插入博客
	 * @author zgx
	 * @param logtable
	 * @return
	 */
	ResultDo insertLogtable(String title,  int type_id ,String centent);
	
	/***
	 * 根据id查询博客内容详情
	 * @author zgx
	 * @param id
	 * @return
	 */
	ResultDo getLogtable(int id);
	
	/**
	 * 根据博主id得到该博主的所有的博客
	 * @author Zgx
	 * @param identityId
	 * @return
	 */
	ResultDo selectLogtables();
	
	/**
	 * 根据博主的id以及类别的id进行查询该类别下的所有的博客
	 * @param categoryId 类别id
	 * @param id 博主id
	 * @return
	 */
	ResultDo selectLogtablesBy(int id);
	
	/**
	 * 根据博主的id查询出该博主的排名前十的博客
	 * type 指的是该博主前十排名的依据是
	 * @param id
	 * @return
	 */
	ResultDo getLogtableTop(String type);
	
	/**
	 * 修改点赞数据或者是点击量
	 * @param type 0为修改点击量 1为修改点赞数
	 * @param number
	 * @param id 该id为博客id
	 * @return
	 */
	ResultDo updateLogtable(int type,int number,int id);

}
