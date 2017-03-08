package cn.edu.zut.personalBlog.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
