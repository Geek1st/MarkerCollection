package com.geeklib.service.impl;

import com.geeklib.dao.UserMapper;
import com.geeklib.model.User;
import com.geeklib.service.IUserService;

public class UserServiceImpl implements IUserService
{
	UserMapper userMapper;

	public UserMapper getUserMapper()
	{
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper)
	{
		this.userMapper = userMapper;
	}

	public User queryById(int id)
	{
		return userMapper.queryById(id);
	}

}
