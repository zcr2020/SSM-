package com.chap52.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.chap52.dao.UserDao;
import com.chap52.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDao")
	UserDao  userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean doLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		return userDao.doLogin(name, pwd);
	}
}
