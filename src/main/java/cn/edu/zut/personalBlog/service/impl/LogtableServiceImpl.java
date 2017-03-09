package cn.edu.zut.personalBlog.service.impl;

import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.entity.Logtable;
import cn.edu.zut.personalBlog.service.LogtableService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
@Service("LogtableService")
public class LogtableServiceImpl implements LogtableService{

	@Override
	public ResultDo insertLogtable(Logtable logtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDo getLogtable(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDo selectLogtables(int identityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDo selectLogtablesBy(int categoryId, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultDo getLogtableTop(int id, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
