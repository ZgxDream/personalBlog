package cn.edu.zut.personalBlog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.IdentityDao;
import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.LoginService;
@Service("LoginService")
public class LoginServiceImpl implements LoginService{

	@Resource
	public IdentityDao identityDao;
	@Override
	public Identity login(String eamil, String pwd) {
		 Identity identity = new Identity();
		 identity = identityDao.getBlogByemail(eamil, pwd);
		return identity;
	}

}
