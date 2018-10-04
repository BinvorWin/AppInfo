package com.hbh.service.developer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hbh.dao.datadictionary.DataDictionaryMapper;
import com.hbh.entity.DataDictionary;



/**
* @author :Binvor
*2018上午8:51:01
* <p>Description:<p>
*/
@Service
public class DataDictionaryServiceImp implements DataDictionaryService {
	@Resource
	private DataDictionaryMapper mapper;
	
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		return mapper.getDataDictionaryList(typeCode);
	}
}
