package com.Action;

import javax.annotation.Resource;

import com.Service.TravelNotesCommentsService;
import com.domain.TravelNotesComments;
import com.opensymphony.xwork2.ActionSupport;


public class TravelNotesCommentsAction extends ActionSupport{
	private TravelNotesComments tnc;
	private TravelNotesComments[] tncList;
	@Resource
	private TravelNotesCommentsService tncService;
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
	public TravelNotesComments getTnc() {
		return tnc;
	}
	public void setTnc(TravelNotesComments tnc) {
		this.tnc = tnc;
	}
	public TravelNotesComments[] getTncList() {
		return tncList;
	}
	public void setTncList(TravelNotesComments[] tncList) {
		this.tncList = tncList;
	}
	public TravelNotesCommentsService getTncService() {
		return tncService;
	}
	public void setTncService(TravelNotesCommentsService tncService) {
		this.tncService = tncService;
	}
}
