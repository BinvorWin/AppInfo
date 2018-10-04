package com.hbh.service.developer;

import java.util.List;

import com.hbh.entity.AppCategory;


/**
* @author :Binvor
*2018上午8:56:54
* <p>Description:<p>
*/
public interface AppCategoryService {
	/**
	 * 根据父节点parentId获取相应的分类列表
	 * @param parentId
	 * @return
	 * @throws Exception
	 */
	public List<AppCategory> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
