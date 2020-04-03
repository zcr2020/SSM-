package com.chap52.service;

import java.util.List;

import com.chap52.controller.Users;

public interface UserService {
	/**
	 * 用户登录方法
	 * @param name  用户名
	 * @param pwd   密码
	 * @return   true 代表登录成功   false代表登录失败
	 */
	public boolean  doLogin(String name,String pwd);
}
