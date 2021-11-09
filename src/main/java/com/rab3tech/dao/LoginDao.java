package com.rab3tech.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

		@Autowired
		private DataSource dataSource;
		
		public boolean validateUser(String username,String password) {
			String sql="select username from user_login_tbl where username=? and password=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			Object[] data = new Object[] {username,password};
			List<String> users=jdbcTemplate.queryForList(sql,data,String.class);
			return users.size()>0;
			
		}
		
		public boolean getPassword(String username,String password) {
			String sql="select username, password from user_login_tbl where username=? and password=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			Object[] data = new Object[] {username,password};
			List<String> users=jdbcTemplate.queryForList(sql,data,String.class);
			return users.size()>0;
			
		}
	
}
