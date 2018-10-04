package com.hbh.dao.datadictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.DataDictionary;


/**
* @author :Binvor
*2018下午11:32:29
* <p>Description:<p>
*/
public interface DataDictionaryMapper {
	public List<DataDictionary> getDataDictionaryList(@Param("typeCode")String typeCode)throws Exception;
}
