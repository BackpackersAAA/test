package com.domain;

import java.util.List;

public class City {
 private int ID;
 private Province province;
 private String city;
 private List<ScenicSpots> ss;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public Province getProvince() {
	return province;
}
public void setProvince(Province province) {
	this.province = province;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<ScenicSpots> getSs() {
	return ss;
}
public void setSs(List<ScenicSpots> ss) {
	this.ss = ss;
}
 
}
