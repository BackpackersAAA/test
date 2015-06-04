package com.domain;

import java.util.Date;

public class TravelNotesComments {
	private int ID;
	private TravelNotes tn;
	private User user;
	private String Comment;
	private int Praise;
	private Date date;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public TravelNotes getTn() {
		return tn;
	}
	public void setTn(TravelNotes tn) {
		this.tn = tn;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
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
