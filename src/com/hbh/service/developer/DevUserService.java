package com.hbh.service.developer;
/**
* @author :Binvor
* @Date ：2018年10月3日 上午8:59:25
* <p>Description:<p>
*/

import com.hbh.entity.DevUser;

public interface DevUserService {
	
	/**验证登录信息
	 * @param devCode
	 * @param password
	 * @return
	 *
	 */
	public DevUser login(String devCode,String password)throws Exception;
}
