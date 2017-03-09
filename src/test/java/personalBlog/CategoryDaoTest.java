//package personalBlog;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import cn.edu.zut.personalBlog.dao.CategoryDao;
//import cn.edu.zut.personalBlog.entity.Category;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//
//@ContextConfiguration({"classpath:conf/spring-sql.xml"  })
//public class CategoryDaoTest {
//	@Autowired
//	private CategoryDao categroyDao;
//	
////	@Test
////	public void test(){
////		
////		Category category=new Category();
////		category.setId(5);
////		category.setCa_name("c++");
////		category.setCa_resume("�������");
////		categroyDao.addCatById(category);
////		System.out.println(category.toString());
////	}
////	
//	
////	@Test
////    public void test1(){
////		Category category=new Category();
////		category.setId(2);
////	    category.setCa_resume("yuyn");
////	    categroyDao.updateBlogById(category);
////	    System.out.println(category.toString());
////	
////}
////	@Test
////	public void test2(){
////		
////		Category category=new Category();
////		int id=4;
////	   
////	    System.out.println( categroyDao.deleteCateById(id));
////		
////	}
//	@Test
//	public void test3(){
//		Category category=new Category();
//		System.out.println(categroyDao.selectAllCat());
//		
//		
//	}
//}
