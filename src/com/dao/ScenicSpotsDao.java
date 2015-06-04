package com.dao;

import com.domain.ScenicSpots;

public interface ScenicSpotsDao {
	public String QueryAll(); //查询
	public String Add(ScenicSpots scenicSpots); //增加
	public Boolean Change(ScenicSpots scenicSpots); //改
	public Boolean Delete(ScenicSpots scenicSpots); //删
}
