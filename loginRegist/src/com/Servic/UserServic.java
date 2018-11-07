package com.Servic;

import java.util.Date;

import com.entity.User;


public interface UserServic {
	public User loginCheck(String name,String pwd);
	public boolean registCheck(String name,String pwd);
	public User checkName(String username);
	public boolean checkCode(String KEYDATA);
	public void insertUserLoginTime(Date tm);
}
