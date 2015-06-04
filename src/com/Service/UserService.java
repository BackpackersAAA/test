package com.Service;

import java.util.List;

import com.domain.User;

public interface UserService {
	public int login(User user);//µÇÂ½
	public boolean Registered(User user);//×¢²á
	public boolean Change(User user);//ÐÞ¸Ä
	public List<User> Query();//²éÑ¯
	public boolean Delete(User user);//É¾³ý
}
