package com.chap52.service;

import java.util.List;

import com.chap52.controller.Users;

public interface UserService {
	/**
	 * �û���¼����
	 * @param name  �û���
	 * @param pwd   ����
	 * @return   true �����¼�ɹ�   false�����¼ʧ��
	 */
	public boolean  doLogin(String name,String pwd);
}
