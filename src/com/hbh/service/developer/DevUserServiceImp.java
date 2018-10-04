package com.hbh.service.developer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hbh.dao.devuser.userMapper;
import com.hbh.entity.DevUser;

/**
* @author :Binvor
* @Date ：2018年10月3日 上午9:07:57
* <p>Description:<p>
*/
@Service
public class DevUserServiceImp implements DevUserService {
	@Resource
	private userMapper mapper;
	@Override
	public DevUser login(String devCode, String password) {
		DevUser user=null;
		user=mapper.getLoginUser(devCode);
//		验证密码
		if(null!=user) {
			if(user.getDevPassword().equals(password))
				user=null;
		}
		return user;
	}

}
