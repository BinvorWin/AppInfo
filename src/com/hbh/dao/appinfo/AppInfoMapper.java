package com.hbh.dao.appinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.AppInfo;


/**
* @author :Binvor
*2018下午10:59:56
* <p>Description:<p>
*/
public interface AppInfoMapper  {
	public int add(AppInfo appInfo) throws Exception;
	public AppInfo getAppInfo(@Param(value="id")Integer id,@Param(value="APKName")String APKName)throws Exception;
	public List<AppInfo> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
			@Param(value="status")Integer queryStatus,
			@Param(value="categoryLevel1")Integer queryCategoryLevel1,
			@Param(value="categoryLevel2")Integer queryCategoryLevel2,
			@Param(value="categoryLevel3")Integer queryCategoryLevel3,
			@Param(value="flatformId")Integer queryFlatformId,
			@Param(value="devId")Integer devId,
			@Param(value="from")Integer currentPageNo,
			@Param(value="pageSize")Integer pageSize)throws Exception;

public int getAppInfoCount(@Param(value="softwareName")String querySoftwareName,
   @Param(value="status")Integer queryStatus,
   @Param(value="categoryLevel1")Integer queryCategoryLevel1,
   @Param(value="categoryLevel2")Integer queryCategoryLevel2,
   @Param(value="categoryLevel3")Integer queryCategoryLevel3,
   @Param(value="flatformId")Integer queryFlatformId,
   @Param(value="devId")Integer devId)throws Exception;

}
