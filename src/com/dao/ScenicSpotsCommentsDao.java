package com.dao;

import com.domain.ScenicSpots;
import com.domain.ScenicSpotsComments;

public interface ScenicSpotsCommentsDao {
	public String QueryAll(ScenicSpots scenicSpots); //²éÑ¯
	public String Add(ScenicSpotsComments ssc); //Ôö¼Ó
	public String Delete(ScenicSpotsComments ssc); //É¾
}
