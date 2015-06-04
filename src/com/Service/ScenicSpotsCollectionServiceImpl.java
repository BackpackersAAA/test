package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.ScenicSpotsCollectionDao;
import com.domain.ScenicSpotsCollection;
import com.domain.User;


public class ScenicSpotsCollectionServiceImpl implements ScenicSpotsCollectionService{
	@Resource
	private ScenicSpotsCollectionDao ssCollectionDao;
	public List<User> Query(User user) //²éÑ¯
	{
		return ssCollectionDao.QueryAll(user);
	}
	public String Add(ScenicSpotsCollection ssCollection) //Ôö¼Ó
	{
		return "d";
	} 

	public String Delete(ScenicSpotsCollection ssCollection) //É¾
	{
		return "d";
	}
}
