package com.domain;

import java.util.List;

public class User {
	private String UserName;
	private String Password;
	private String Name;
	private String Address;
	private String Gender;
	private String Telephone;
	private int Jurisdiction;
	private List<ScenicSpotsCollection> Collection;
	private List<ScenicSpotsComments> Comments;
	private List<TravelNotesComments> tnc;
	private List<TravelNotes> tn;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public int getJurisdiction() {
		return Jurisdiction;
	}
	public void setJurisdiction(int jurisdiction) {
		Jurisdiction = jurisdiction;
	}
	public List<ScenicSpotsCollection> getCollection() {
		return Collection;
	}
	public void setCollection(List<ScenicSpotsCollection> collection) {
		Collection = collection;
	}
	public List<ScenicSpotsComments> getComments() {
		return Comments;
	}
	public void setComments(List<ScenicSpotsComments> comments) {
		Comments = comments;
	}
	public List<TravelNotesComments> getTnc() {
		return tnc;
	}
	public void setTnc(List<TravelNotesComments> tnc) {
		this.tnc = tnc;
	}
	public List<TravelNotes> getTn() {
		return tn;
	}
	public void setTn(List<TravelNotes> tn) {
		this.tn = tn;
	}
}
