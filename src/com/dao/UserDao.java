package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {
	public User Query(User user);//查询单个
	public boolean Add(User user);//增加
	public boolean Change(User user);//修改
	public List<User> QueryAll();//查询所有
	public boolean Delete(User user);//删除
}
