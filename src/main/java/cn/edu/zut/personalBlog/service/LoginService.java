package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.supervisor.ResultDo;

public interface LoginService {

	ResultDo login(String eamil,String pwd);
}
