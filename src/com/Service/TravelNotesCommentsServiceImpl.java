package com.Service;

import javax.annotation.Resource;

import com.dao.TravelNotesCommentsDao;



public class TravelNotesCommentsServiceImpl implements  TravelNotesCommentsService{
	@Resource
	private TravelNotesCommentsDao tncDao;
	public String Query() //查询
	{
		
		return "d";
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
