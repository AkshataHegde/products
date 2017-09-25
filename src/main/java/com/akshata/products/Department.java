package com.akshata.products;

import java.util.List;  

public class Department {

	private int dID;
	private String dname;
	
	private List<Cat> cats;
	
	public List<Cat> getCats() {
		return cats;
	}
	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}
	public int getdID() {
		return dID;
	}
	public void setdID(int dID) {
		this.dID = dID;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
}
