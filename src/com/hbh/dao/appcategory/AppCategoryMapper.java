package com.hbh.dao.appcategory;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.AppCategory;


/**
* @author :Binvor
*2018上午8:55:15
* <p>Description:<p>
*/
public interface AppCategoryMapper {
	public List<AppCategory> getAppCategoryListByParentId(@Param("parentId")Integer parentId)throws Exception;

}
