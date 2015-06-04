package com.dao;

import java.util.List;

import com.domain.TravelNotes;


public interface TravelNotesDao {

	public List<TravelNotes> QueryAll(); //查询
	public String Add(TravelNotes scenicSpots); //增加
	public Boolean Change(TravelNotes scenicSpots); //改
	public Boolean Delete(TravelNotes scenicSpots); //删

}
