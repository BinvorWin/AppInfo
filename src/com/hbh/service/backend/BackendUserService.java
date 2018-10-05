package com.hbh.service.backend;

import com.hbh.entity.BackendUser;

/**
* @author :Binvor
*2018上午9:58:34
* <p>Description:<p>
*/
public interface BackendUserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public BackendUser login(String userCode,String userPassword) throws Exception;
}
