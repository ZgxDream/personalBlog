package cn.edu.zut.personalBlog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.IdentityDao;
import cn.edu.zut.personalBlog.entity.Identity;
import cn.edu.zut.personalBlog.service.IdentityService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
@Service("IdentityService")
public class InentityServiceImpl implements IdentityService{

	@Autowired
	private IdentityDao identityDao;
	@Override
	public ResultDo updateIdenity(Identity identity) {
		ResultDo resultDo = new ResultDo<>();
		int succ = 0;
		if (identity != null){
			succ = identityDao.updateIdentity(identity);
			resultDo.setResult(succ);
			resultDo.setSuccess(true);
		}else{
			resultDo.setResult(succ);
			resultDo.setMessage("查询失败");
		}
		return resultDo;
	}

	@Override
	public ResultDo getIdentity(int id) {
		ResultDo resultDo = new ResultDo<>();
		Identity identity = new Identity();
		identity = identityDao.selectInfoById(id);
		if (identity != null){
			resultDo.setResult(identity);
			resultDo.setSuccess(true);
		} else{
			resultDo.setMessage("查询失败");
		}
		return resultDo;
	}

}
