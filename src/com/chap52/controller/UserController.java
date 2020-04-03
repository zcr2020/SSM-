package com.chap52.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.chap52.service.UserService;
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("login")
	public String doLogin(Users user) {
		if(userService.doLogin(user.getLoginId(), user.getLoginPwd())){
			return "index";
		}
		else{
			return "login";
		}
	}
}
