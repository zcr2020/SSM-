package com.chap52.dao;
/**
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * �û���¼����
	 * @param name  �û���
	 * @param pwd   ����
	 * @return   true �����¼�ɹ�   false�����¼ʧ��
	 */
	public boolean doLogin(final String name,final String pwd);
}
