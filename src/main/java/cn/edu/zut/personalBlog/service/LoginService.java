package cn.edu.zut.personalBlog.service;

import cn.edu.zut.personalBlog.entity.Identity;

public interface LoginService {

	public Identity login(String eamil,String pwd);
}
