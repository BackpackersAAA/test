package com.domain;

import java.util.Date;

public class ScenicSpotsComments {
	private int ID;
	private ScenicSpots ss;
	private User user;
	private String Comments;
	private int Praise;
	private Date date;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public ScenicSpots getSs() {
		return ss;
	}
	public void setSs(ScenicSpots ss) {
		this.ss = ss;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public int getPraise() {
		return Praise;
	}
	public void setPraise(int praise) {
		Praise = praise;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
