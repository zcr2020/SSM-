package com.chap52.dao.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.chap52.controller.Users;
import com.chap52.dao.UserDao;
/**
 * UserDaoImpl实现UserDao接口， 通过JdbcTemplate实现对用户修改密码
 * 
 * @author Administrator
 * 
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public boolean doLogin(final String name,final String pwd) {
		 String sql="select * from users where loginId=? and loginPwd=?";
		 RowMapper<Users> rowMapper=new
		 BeanPropertyRowMapper<Users>(Users.class);
		 Object []args=new Object[]{name,pwd};
		 try {
		 jdbcTemplate.queryForObject(sql, args, rowMapper);
		 } catch (DataAccessException e) {
		 System.out.println("用户名或者密码不正确");
		 return false;
		 }
		 return true;	
	}
}
