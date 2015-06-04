package com.dao;

import java.util.List;

import com.domain.ScenicSpotsCollection;
import com.domain.User;

public interface ScenicSpotsCollectionDao {
	public List<User> QueryAll(User user); //²éÑ¯
	public String Add(ScenicSpotsCollection ssc); //Ôö¼Ó
	public String Delete(ScenicSpotsCollection ssc); //É¾
}
