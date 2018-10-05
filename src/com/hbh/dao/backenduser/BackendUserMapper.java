package com.hbh.dao.backenduser;

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.BackendUser;


/**
* @author :Binvor
*2018上午9:52:51
* <p>Description:<p>
*/
public interface BackendUserMapper {
	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public BackendUser getLoginUser(@Param("userCode")String userCode)throws Exception;
}
