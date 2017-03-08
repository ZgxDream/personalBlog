package cn.edu.zut.personalBlog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.IdentityService;

@Controller
@RequestMapping("/")
public class IdentityController {
	@Resource
	public IdentityService identityService;
	
	@RequestMapping("aboutMe")
	 public String aboutMe(HttpSession session,Model model){
		Identity identity = new Identity();
		identity.setId(1);
		identity.setName("宋鎏鑫");
		identity.setQq_num("851338190");
		identity.setPhone("18538007606");
		identity.setSex(0);
        identity.setEmail("songliuxin@outlook.com");
        identity.setResume("我们的征途是星辰大海！");
//		Identity identity2= (Identity) session.getAttribute("user");
//		identity = identityService.getIdentity(identity2.id);
		model.addAttribute("identity",identity);
		return "./aboutMe";
	}
	
	@RequestMapping("updateMyInfo")
	 public String updateMyInfo(HttpSession session,Model model,
			 @RequestParam("name") String name,@RequestParam("qq") String qq,
			 @RequestParam("email") String email,@RequestParam("resume") String resume,
			 @RequestParam("phone") String phone){
		Identity identity= (Identity) session.getAttribute("user");
		Identity identity2=new Identity();
		identity2.setId(identity.getId());
		identity2.setName(name);
		identity2.setEmail(email);
		identity2.setQq_num(qq);
		identity2.setPhone(phone);
		identity2.setResume(resume);
		System.out.println(identity2.toString());
		return "redirect:./aboutMe.do";
	}
}
