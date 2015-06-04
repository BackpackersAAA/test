package com.Action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.Service.ScenicSpotsService;
import com.domain.ScenicSpots;
import com.domain.TravelNotes;


public class ScenicSpotsAction extends ActionSupport{
	private ScenicSpots scenicSpots;
	private ScenicSpots[] ssList;
	@Resource
	private ScenicSpotsService ssService;
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
	public ScenicSpots getScenicSpots() {
		return scenicSpots;
	}
	public void setScenicSpots(ScenicSpots scenicSpots) {
		this.scenicSpots = scenicSpots;
	}
	public ScenicSpots[] getSsList() {
		return ssList;
	}
	public void setSsList(ScenicSpots[] ssList) {
		this.ssList = ssList;
	}
	public ScenicSpotsService getSsService() {
		return ssService;
	}
	public void setSsService(ScenicSpotsService ssService) {
		this.ssService = ssService;
	}

}