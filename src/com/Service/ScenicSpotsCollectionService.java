package com.Service;

import java.util.List;

import com.domain.ScenicSpotsCollection;
import com.domain.User;

public interface ScenicSpotsCollectionService {
	public List<User> Query(User user); //²éÑ¯
	public String Add(ScenicSpotsCollection ssCollection); //Ôö¼Ó
	public String Delete(ScenicSpotsCollection ssCollection); //É¾
}
