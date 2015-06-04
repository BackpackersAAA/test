package com.domain;

import java.util.List;

public class ScenicSpots {
	private int ID;
	private String Name;
	private City city;
	private String Address;
	private float Price;
	private String Introduction;
	private int Praise;
	private List<ScenicSpotsComments> ssComments;
	private List<ScenicSpotsImage> ssImage;
	private List<ScenicSpotsCollection> Collection;

	public List<ScenicSpotsCollection> getCollection() {
		return Collection;
	}
	public void setCollection(List<ScenicSpotsCollection> collection) {
		Collection = collection;
	}
	public List<ScenicSpotsComments> getSsComments() {
		return ssComments;
	}
	public void setSsComments(List<ScenicSpotsComments> ssComments) {
		this.ssComments = ssComments;
	}
	public List<ScenicSpotsImage> getSsImage() {
		return ssImage;
	}
	public void setSsImage(List<ScenicSpotsImage> ssImage) {
		this.ssImage = ssImage;
	}
	public int getID() { 
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getIntroduction() {
		return Introduction;
	}
	public void setIntroduction(String introduction) {
		Introduction = introduction;
	}
	public int getPraise() {
		return Praise;
	}
	public void setPraise(int praise) {
		Praise = praise;
	}
}
