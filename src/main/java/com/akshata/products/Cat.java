package com.akshata.products;
import java.util.List;  

public class Cat {
	
	private int cID;
	private String cname;
	
	private List<Sc> scs;

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Sc> getScs() {
		return scs;
	}

	public void setScs(List<Sc> scs) {
		this.scs = scs;
	} 
	
	
	

}
