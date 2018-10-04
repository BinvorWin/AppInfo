package com.hbh.service.developer;

import java.util.List;

import com.hbh.entity.DataDictionary;


/**
* @author :Binvor
*2018上午8:50:17
* <p>Description:<p>
*/
public interface DataDictionaryService {
	/**
	 * 根据typeCode查询相应的数据字典列表
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
