package cn.edu.zut.personalBlog.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.IdentityDao;
import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.LoginService;
@Service("LoginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private IdentityDao identityDao;
	
	@Override
	public Identity login(String eamil, String pwd) {
		Identity identity = new Identity();
		return identity;
	}

}
