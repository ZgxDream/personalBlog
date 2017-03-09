//package cn.edu.zut.personalBlog.test;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import cn.edu.zut.personalBlog.dao.IdentityDao;
//import cn.edu.zut.personalBlog.entity.Identity;
//
//public class DaoTest {
//
//	@Autowired
//	private IdentityDao identityDao;
//
//	@Before
//	public void setUp() throws Exception {
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "classpath:conf/spring-sql.xml",
//						"classpath:conf/spring-mvc.xml" });
//		identityDao = (IdentityDao) context.getBean("identityDao");
//	}
//	@Test
//	public void oneTest(){
//		
//		Identity identity = new Identity();
//		identity = identityDao.getBlogByemail("15239642754@163.com", "123456");
//		System.out.println(identity.toString());
//	}
//}
