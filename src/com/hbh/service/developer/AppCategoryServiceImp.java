package com.hbh.service.developer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hbh.dao.appcategory.AppCategoryMapper;
import com.hbh.entity.AppCategory;


/**
* @author :Binvor
*2018上午8:57:36
* <p>Description:<p>
*/
@Service
public class AppCategoryServiceImp implements AppCategoryService {

	@Resource
	private AppCategoryMapper mapper;
	
	@Override
	public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppCategoryListByParentId(parentId);
	}
}
