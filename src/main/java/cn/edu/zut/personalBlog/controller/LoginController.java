package cn.edu.zut.personalBlog.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.management.relation.Role;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.LoginService;


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
	
//	@RequestMapping("index")
//    public String index(){
//        return "./index";
//    }
	@RequestMapping("login")
	 public String toLogin(HttpSession session){
		return "./login";
	}
	@RequestMapping("toLogin")
    public ModelAndView toLogin(@RequestParam("p") String p,@RequestParam("u") String u,HttpSession session){
//        resultDo = serviceFit.getEmpService().verify(u.trim(), MDUtil.MD5Tools(p.trim()),role);
//        if (resultDo.isSuccess()){
//            session.setAttribute("user",resultDo.getResult());
//            session.setAttribute("role",role);
//            session.setAttribute("pathCode",role.getName());
//            if (role == Role.TEA || role == Role.STU || role == Role.ADMIN){
//                session.setAttribute("functionMap", DataLS.functionMap);
//                if(role == Role.TEA){
//                	Teacher teacher=(Teacher)resultDo.getResult();
//                	resultDo=serviceFit.getTeacherGroupService().teaGroupTgIdForTeacher(teacher.getTeaId());
//                	if(resultDo.isSuccess()){
//                		session.setAttribute("doucking", resultDo.getResult());
//                	}
//                }
//            }
//            return new ModelAndView("redirect:./"+role.getName() + "/home.do");
//        } else {
//            return new ModelAndView("index","mag",resultDo.getMessage());
//        }
		Identity identity = new Identity();
		identity = loginService.login(u, p);
		if (identity != null){
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
