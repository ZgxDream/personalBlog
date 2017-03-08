package personalBlog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.zut.personalBlog.dao.IdentityDao;
import cn.edu.zut.personalBlog.entity.Identity;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({"classpath:conf/spring-sql.xml"  })
public class IdentityDaoTest {
@Autowired
 private IdentityDao identityDao;

 @Test
 public void test(){
	 int id=3;
     identityDao.selectInfoById(id);
	 System.out.println(identityDao.toString());
	 
 }
 


//@Test
//public void test2(){
//   
//	Identity id=new Identity();
//	id.setId(3);
//	id.setName("������");
//	id.setSex(0);
//	id.setPhone("333333");
//	id.setQq_num("21412");
//	id.setResume("���͵�С�۷�");
//	identityDao.insert(id);
//	System.err.println(identityDao.toString());
//
//}
}