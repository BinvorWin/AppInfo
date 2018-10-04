package com.hbh.controller.developer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hbh.entity.DevUser;
import com.hbh.service.developer.DevUserService;
import com.hbh.service.developer.DevUserServiceImp;
import com.hbh.tool.Constants;
import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
* @author :Binvor
* @Date ：2018年10月3日 上午9:14:29
* <p>Description:<p>
*/
@Controller
@RequestMapping(value="/dev")
public class DevUserControlloer {
	@Resource
	private DevUserService service;
	private Logger logger=Logger.getLogger(DevUserControlloer.class);
	@RequestMapping(value="/login")
	public String login() {
		logger.debug("LoginController welcome AppInfoSystem develpor==================");
		return "devlogin";
	}
	@RequestMapping(value="/dologin")
	public String dologin(@RequestParam String devCode,@RequestParam String devPassword,
			HttpSession session,HttpServletRequest request) {
		logger.debug("doLogin==================");
		DevUser user=null;
		try {
			user=service.login(devCode, devPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null!=user) {//登录成功
//			放入session
			session.setAttribute(Constants.DEV_USER_SESSION,user);
//			跳转到页面（main.jsp）
			return "redirect:/dev/flatform/main";
		}else {
//			密码不正确提示重新登录
			request.setAttribute("error", "账号密码不匹配");
			return "devlogin";
		}
		
	}
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session) {
//		验证是否有session信息，防止非法登录，没有就跳转到登录页面
		if(session.getAttribute(Constants.DEV_USER_SESSION)==null)
		{
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
//		退出清除esison
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "devlogin";
		
	}
}
