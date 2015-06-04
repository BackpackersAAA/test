package com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import com.domain.ScenicSpots;
import com.domain.ScenicSpotsCollection;
import com.domain.User;

public class ScenicSpotsCollectionDaoImpl implements ScenicSpotsCollectionDao {

	@Resource
	SessionFactory sessionFactory;
	public List<User> QueryAll(User user) {
		Query query=sessionFactory.openSession().createQuery("from ScenicSpotsCollection s where s.UserName=?");
		query.setString(0,user.getUserName());
		return query.list();
	}

	public String Add(ScenicSpotsCollection ssc) {
		// TODO Auto-generated method stub
		return null;
	}

	public String Delete(ScenicSpotsCollection ssc) {
		// TODO Auto-generated method stub
		return null;
	}
}
