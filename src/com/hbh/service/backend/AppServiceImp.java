package com.hbh.service.backend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hbh.dao.appinfo.AppInfoMapper;
import com.hbh.entity.AppInfo;


/**
* @author :Binvor
*2018上午10:10:02
* <p>Description:<p>
*/
@Service
public class AppServiceImp implements AppService {
	@Resource
	private AppInfoMapper mapper;
	
	public AppInfo getAppInfo(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfo(id, null);
	}

	public List<AppInfo> getAppInfoList(String querySoftwareName,
									Integer queryCategoryLevel1,
									Integer queryCategoryLevel2, Integer queryCategoryLevel3,
									Integer queryFlatformId,Integer currentPageNo,
									Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoList(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
				                 queryCategoryLevel3, queryFlatformId, null, (currentPageNo-1)*pageSize, pageSize);
	}

	public int getAppInfoCount(String querySoftwareName,
							Integer queryCategoryLevel1, 
							Integer queryCategoryLevel2,
							Integer queryCategoryLevel3, 
							Integer queryFlatformId)
							throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoCount(querySoftwareName, 1, queryCategoryLevel1, queryCategoryLevel2, 
									queryCategoryLevel3, queryFlatformId, null);
	}

	public boolean updateSatus(Integer status, Integer id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(mapper.updateSatus(status, id) > 0 ){
			flag = true;
		}
		return flag;
	}
}