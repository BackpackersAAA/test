package com.Service;

import java.util.List;

import javax.annotation.Resource;

import com.dao.TravelNotesDao;
import com.domain.TravelNotes;


public class TravelNotesServiceImpl implements TravelNotesService{
	@Resource
	private TravelNotesDao tnDao;
	public List<TravelNotes> Query() //查询
	{

		return  tnDao.QueryAll();
	}
	public String Add() //增加
	{
		return "d";
	}
	public String Change() //改
	{
		return "d";
	}
	public String Delete() //删
	{
		return "d";
	}
}
