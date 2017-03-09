package cn.edu.zut.personalBlog.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.zut.personalBlog.dao.LogtableDao;
import cn.edu.zut.personalBlog.entity.Category;
import cn.edu.zut.personalBlog.entity.Logtable;
import cn.edu.zut.personalBlog.service.LogtableService;
import cn.edu.zut.personalBlog.supervisor.ResultDo;
@Service("LogtableService")
public class LogtableServiceImpl implements LogtableService{
	
	@Autowired
	private LogtableDao logtableDao;

	@Override
	public ResultDo insertLogtable(String title, int type_id,String centent) {
		Logtable logtable = new Logtable();
		ResultDo resultDo = new ResultDo();
		int succ = 0;
		if (title != null && type_id >0 && centent != null){
			logtable.setContent(centent);
			logtable.setDate(new Date());
			logtable.setTitle(title);
			logtable.setCategory_id(type_id);
			succ = logtableDao.addBlogById(logtable);
		}
		if (succ >0){
			resultDo.setResult(succ);
			resultDo.setSuccess(true);
		}else{
			resultDo.setMessage("插入失败");
		}
		return resultDo;
	}

	@Override
	public ResultDo getLogtable(int id) {
		ResultDo resultDo = new ResultDo();
		Logtable logtable = new Logtable();
		logtable = logtableDao.selectBlogById(id);
		if (logtable != null){
			resultDo.setResult(logtable);
			resultDo.setSuccess(true);
		}else{
			resultDo.setMessage("查询失败");
		}
		return resultDo;
	}

	@Override
	public ResultDo selectLogtables() {
		ResultDo resultDo = new ResultDo();
		List<Logtable> list = new ArrayList<>();
//		list = logtableDao.
		return null;
	}

	@Override
	public ResultDo selectLogtablesBy(int id) {
		ResultDo resultDo = new ResultDo();
		List<Logtable> list = new ArrayList<>();
		list = logtableDao.selectAllBlogById(id);
		if(list.size() >0){
			resultDo.setResult(list);
			resultDo.setSuccess(true);
		}
		list = logtableDao.selectAll();
		return resultDo;
	}

	@Override
	public ResultDo getLogtableTop(String type) {
		ResultDo resultDo = new ResultDo();
		List<Logtable> list = new ArrayList<>();
		int id = 0;
		List<Category> listCategory = new ArrayList<>();
		if (type == "" || type.equals("") || type == null){
			resultDo.setResult(list);
			resultDo.setSuccess(true);
			return resultDo;
		}
		for (Category category :listCategory){
			if (category.getCa_name() == type){
				id = category.getId();
				list = logtableDao.selectAllBlogById(id);
			}
		}
		this.sortList(list);
		List<Logtable> listTop = new ArrayList<>();
		listTop = list.subList(0,11);
		if (listTop.size() > 0){
			resultDo.setResult(listTop);
			resultDo.setSuccess(true);
		}
		return resultDo;
	}

	@Override
	public ResultDo updateLogtable(int type, int number,int id) {
		ResultDo resultDo = new ResultDo();
		int succ = 0;
		if (type == 0){
		}
		if (type == 1){
			succ = logtableDao.updateLikesById(id);
		}
		if (succ > 0){
			resultDo.setResult(succ);
			resultDo.setSuccess(true);
		}else{
			resultDo.setMessage("错误失败");
		}
		return resultDo;
	}

	public List<Logtable> sortList(List<Logtable> list){
		Collections.sort(list, new Comparator<Logtable>() {

			@Override
			public int compare(Logtable logtable1, Logtable logtable2) {
				if (logtable1.getNumber() > logtable2.getNumber()){
					return 1;
				}
				if(logtable1.getNumber() > logtable2.getNumber()) {
					return 0;
				}
				return -1;
			}
		});
		return list;
	}
	


}
