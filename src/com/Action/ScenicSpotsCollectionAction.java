package com.Action;

import java.util.List;

import javax.annotation.Resource;

import com.Service.ScenicSpotsCollectionService;
import com.domain.ScenicSpotsCollection;
import com.domain.TravelNotes;
import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ScenicSpotsCollectionAction extends ActionSupport{
	private ScenicSpotsCollection ssCollection;
	private List<User> ssCollectionList;
	@Resource
	private ScenicSpotsCollectionService ssCollectionService;
	public String Query() //²éÑ¯
	{
		User user=(User)ActionContext.getContext().getSession().get("User");
		if(user!=null)
		{
			ssCollectionList=ssCollectionService.Query(user);
			return "CollectionQueryYES";
		}
		return "CollectionQueryNO";
	}
	public String Add() //Ôö¼Ó
	{
		User user=(User)ActionContext.getContext().getSession().get("User");
		if(user!=null)
		{
			ssCollectionService.Add(ssCollection);
			return "CollectionYES";
		}
		return "d";
	}
	public String Delete() //É¾
	{

		return "d";
	}
	public ScenicSpotsCollection getSsCollection() {
		return ssCollection;
	}
	public void setSsCollection(ScenicSpotsCollection ssCollection) {
		this.ssCollection = ssCollection;
	}
	public List<User> getSsCollectionList() {
		return ssCollectionList;
	}
	public void setSsCollectionList(List<User> ssCollectionList) {
		this.ssCollectionList = ssCollectionList;
	}
	public ScenicSpotsCollectionService getSsCollectionService() {
		return ssCollectionService;
	}
	public void setSsCollectionService(
			ScenicSpotsCollectionService ssCollectionService) {
		this.ssCollectionService = ssCollectionService;
	}


}
