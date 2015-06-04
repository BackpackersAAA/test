package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.domain.User;

public class UserDaoImpl implements UserDao{
   @Resource
   private SessionFactory sessionFactory;
	public User Query(User user) //查询
	{
		// TODO Auto-generated method stub
        Query query=sessionFactory.openSession().createQuery("from [User] user where user.UserName=?");
        query.setString(0,user.getUserName());
		return  (User) query.list().get(0);
	}

	public boolean Add(User user) //增加
	{
		// TODO Auto-generated method stub
        user.setUserName("1234568");
        user.setTelephone("111");
        user.setJurisdiction(1);
        Session session=sessionFactory.openSession();
		Serializable serializable=session.save(user);
		session.flush();
		System.out.println(serializable.toString()+"YES");
		return true;
	}

	public boolean Change(User user) //修改
	{
		// TODO Auto-generated method stub

		sessionFactory.openSession().update(user);
		return false;
	}

	public List<User> QueryAll() //查询所有
	{
		 Query query=sessionFactory.openSession().createQuery("from [User]");
		return query.list();
	}

	public boolean Delete(User user) //删除
	{
		// TODO Auto-generated method stub
		sessionFactory.openSession().delete(user);
		return false;
	}

}
