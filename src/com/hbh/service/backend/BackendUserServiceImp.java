package com.hbh.service.backend;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hbh.dao.backenduser.BackendUserMapper;
import com.hbh.entity.BackendUser;


/**
* @author :Binvor
*2018上午9:59:35
* <p>Description:<p>
*/
@Service
public class BackendUserServiceImp implements BackendUserService {
	@Resource
	private BackendUserMapper mapper;
	
	public BackendUser login(String userCode, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		BackendUser user = null;
		user = mapper.getLoginUser(userCode);
		//匹配密码
		if(null != user){
			if(!user.getUserPassword().equals(userPassword))
				user = null;
		}
		return user;
	}

}

