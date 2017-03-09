package cn.edu.zut.personalBlog.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.IdentityDao;
import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.LoginService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
@Service("LoginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private IdentityDao identityDao;
	
	@Override
	public ResultDo login(String eamil, String pwd) {
		ResultDo resultDo = new ResultDo<>();
		Identity identity = new Identity();
		identity = identityDao.getBlogByemail(eamil, pwd);
		if (identity != null){
			resultDo.setSuccess(true);
			resultDo.setResult(identity);
		}else{
			resultDo.setMessage("账号密码出错");
		}
		
		return resultDo;
	}

}
