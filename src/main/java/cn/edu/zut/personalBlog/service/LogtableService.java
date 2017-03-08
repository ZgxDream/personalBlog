package cn.edu.zut.personalBlog.service;

import java.util.List;

import cn.edu.zut.personalBlog.entity.Logtable;

public interface LogtableService {
	
	/**
	 * 插入博客
	 * @author zgx
	 * @param logtable
	 * @return
	 */
	public 	Logtable insertLogtable(Logtable logtable);
	
	/***
	 * 根据id查询博客内容详情
	 * @author zgx
	 * @param id
	 * @return
	 */
	public Logtable getLogtable(int id);
	
	/**
	 * 根据博主id得到该博主的所有的博客
	 * @author Zgx
	 * @param identityId
	 * @return
	 */
	public List<Logtable> selectLogtables(int identityId);
	
	/**
	 * 根据博主的id以及类别的id进行查询该类别下的所有的博客
	 * @param categoryId 类别id
	 * @param id 博主id
	 * @return
	 */
	public List<Logtable> selectLogtablesBy(int categoryId, int id);
	
	/**
	 * 根据博主的id查询出该博主的排名前十的博客
	 * type 指的是该博主前十排名的依据是
	 * @param id
	 * @return
	 */
	public List<Logtable> getLogtableTop(int id,String type);

}
