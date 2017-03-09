package cn.edu.zut.personalBlog.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.zut.personalBlog.entity.Logtable;

@Repository
public interface LogtableDao {
    /**
     * 增加博客
     * @param logtable
     * @return
     */
	int addBlogById(Logtable logtable);
	/**
	 * 删除博客
	 * @param id
	 * @return
	 */
	int deleteBlogById(int id);
	/**
	 * 修改博客
	 * @param logtable
	 * @return
	 */
	int updateBlogById(Logtable logtable);
	/**
	 * 查看博客
	 * @param id
	 * @return
	 */
    Logtable selectBlogById(int id);
    
    /**
     * 查询全部博客
     */
    List<Logtable> selectAll();
    
    /**
     * 查看此类别全部博客
     * @param category_id
     * @return
     */
    List<Logtable> selectAllBlogById(int category_id,int id);
    
    /**
     * 修改点击的次数
     */
    int updateNumbersById(int id);
    /**
     * 修改点赞的次数
     * @param id
     * @return
     */
    int updateLikesById(int id);
}
