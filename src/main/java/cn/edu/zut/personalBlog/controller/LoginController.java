package cn.edu.zut.personalBlog.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.LoginService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;


/**
 * 该控制层主要是用于对于登录的控制
 * @author zgx
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {
	
	@Resource
	public LoginService loginService;
	
	@RequestMapping("index")
    public String index(){
        return "./index";
    }
	@RequestMapping("login")
	 public String toLogin(HttpSession session){
		return "./login";
	}
	@RequestMapping("toLogin")
    public ModelAndView toLogin(@RequestParam("p") String p,@RequestParam("u") String u,HttpSession session){
		Identity identity = new Identity();
		ResultDo resultDo = new ResultDo();
		resultDo = loginService.login(u, p);
		if (resultDo.isSuccess()){
			session.setAttribute("user", resultDo.getResult());
			return new ModelAndView("redirect:./index.jsp");
			
			
		}else{
			return new ModelAndView("index","mag","账号密码错误");
		}
    }

    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "./index";
    }

}
