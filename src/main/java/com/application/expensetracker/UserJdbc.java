package com.application.expensetracker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class UserJdbc {
	
	
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);
	}

	class UserMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

	RegisteredUser user = new RegisteredUser(

	rs.getString("name"),
	rs.getString("email"),
	rs.getString("password")

	);
	user.setUserId(rs.getInt("userId"));
	return user;
	}

	}

	int insertUser(RegisteredUser user) {
	return jdbcTemplate.update("insert into accountcreation values(?,?,?)",new Object[] {
	user.getName(),
	                user.getEmail(),
	                user.getPassword(),
	});
	}

	List<RegisteredUser> getAllUsers(){
	return jdbcTemplate.query("select * from registeredusers", new UserMapper());
	}

	}


