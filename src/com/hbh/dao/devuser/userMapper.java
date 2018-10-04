package com.hbh.dao.devuser;
/**
* @author :Binvor
* @Date ：2018年10月3日 上午8:12:25
* <p>Description:<p>
*/

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.DevUser;

public interface userMapper {
//	根据账号查询
	public  DevUser getLoginUser(@Param("devCode") String devCode);
}
