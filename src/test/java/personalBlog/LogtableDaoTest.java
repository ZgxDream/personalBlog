package personalBlog;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.zut.personalBlog.dao.LogtableDao;
import cn.edu.zut.personalBlog.entity.Logtable;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({"classpath:conf/spring-sql.xml"  })
public class LogtableDaoTest {
	@Autowired
  private LogtableDao logtableDao;
//    @Test
//	public void test(){
//		 Logtable logtable=new Logtable();
//		 
//		 logtable.setId(2);
//		 logtable.setDate(new Date());
//		 logtable.setTitle("天黑");
//		 logtable.setContent("我在这");
//		 logtable.setNumber(0);
//		 logtable.setLikes(0);
//		 System.out.println(logtableDao.addBlogById(logtable));
//	}
//	
//	@Test
//	public void test1(){
//		Logtable logtable=new Logtable();
//		logtable.setId(2);
//		logtable.setLikes(1);
//		logtableDao.updateBlogById(logtable);
//		System.out.println(logtable.toString());
//		
//		
//	}
//	@Test
//	public void test2(){
//		Logtable logtable=new Logtable();
//		if(logtable !=null){
//			System.out.println(logtableDao.selectAll(logtable));
//		}
//		
//	}
	
//	@Test
//	public void test3(){
//		Logtable logtable=new Logtable();
//		logtable.setId(2);
//		logtable.setContent("说好的呢");
//		logtableDao.updateBlogById(logtable);
//		System.out.println(logtable.toString());
//	}
//	
//	@Test
//	public void test4(){
//		Logtable logtable=new Logtable();
//		int id=2;
//		System.out.println(logtableDao.selectBlogById(id));
//		
//	}
	@Test
	public void test(){
		
		Logtable logtable=new Logtable();
		int id=2;
		System.out.println(logtableDao.updateLikesById(id));
		
		
	}
}
