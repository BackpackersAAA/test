package com.domain;

import java.util.Date;
import java.util.List;

public class TravelNotes {
	private int ID;
	private User user;
	private String Name;
	private String Raiders;
	private int Praise;
	private Date date;
	private List<TravelNotesComments> tnc;
	private List<TravelNotesImage> tnImage;
	
	public List<TravelNotesComments> getTnc() {
		return tnc;
	}
	public void setTnc(List<TravelNotesComments> tnc) {
		this.tnc = tnc;
	}
	public List<TravelNotesImage> getTnImage() {
		return tnImage;
	}
	public void setTnImage(List<TravelNotesImage> tnImage) {
		this.tnImage = tnImage;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRaiders() {
		return Raiders;
	}
	public void setRaiders(String raiders) {
		Raiders = raiders;
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
