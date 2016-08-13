package com.geeklib.model;

import java.util.Calendar;

public class User
{
	private int id;
	private String username;
	private String password;
	private Calendar registerDate;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Calendar getRegisterDate()
	{
		return registerDate;
	}

	public void setRegisterDate(Calendar registerDate)
	{
		this.registerDate = registerDate;
	}
	
}
