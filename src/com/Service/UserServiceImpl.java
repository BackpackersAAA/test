package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.UserDao;
import com.domain.User;

public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	public int  login(User user)//µÇÂ½
	{
		User user1=userDao.Query(user);
		if(user1==null)//²éÑ¯½á¹ûÎª¿Õ
		{
			return 1;
		}
		else if(user.getPassword().equals(user1.getPassword()))//²éÑ¯ÃÜÂëÅĞ¶Ï
		{ 
			if(user1.getJurisdiction()==1) //È¨ÏŞÅĞ¶Ï
			{
			   return 2; 
			}
			return 3; 
		}
		return 1;
	}
	public boolean Registered(User user)//×¢²á
	{
		return userDao.Add(user);
	}
	public boolean Change(User user)//ĞŞ¸Ä
	{
		userDao.Change(user);
		return false;
	}
	public List<User> Query()//²éÑ¯
	{
		return userDao.QueryAll();
	}
	public boolean Delete(User user)//É¾³ı
	{

		userDao.Delete(user);
		return false;
	}


}
