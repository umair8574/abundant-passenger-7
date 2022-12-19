package com.bean_classes;

public class Criminal {
	
	int Cid;
	String Cname;
	int Cage;
	String Gender;
	String Address;
	String facemark;
	String carea;
	String Crname;
	
	public Criminal()
	{
		
	}

	public Criminal(int cid, String cname, int cage, String gender, String address, String facemark, String carea,
			String crname) {
		super();
		Cid = cid;
		Cname = cname;
		Cage = cage;
		Gender = gender;
		Address = address;
		this.facemark = facemark;
		this.carea = carea;
		Crname = crname;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public int getCage() {
		return Cage;
	}

	public void setCage(int cage) {
		Cage = cage;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getFacemark() {
		return facemark;
	}

	public void setFacemark(String facemark) {
		this.facemark = facemark;
	}

	public String getCarea() {
		return carea;
	}

	public void setCarea(String carea) {
		this.carea = carea;
	}

	public String getCrname() {
		return Crname;
	}

	public void setCrname(String crname) {
		Crname = crname;
	}

	@Override
	public String toString() {
		return "Criminal [Cid=" + Cid + ", Cname=" + Cname + ", Cage=" + Cage + ", Gender=" + Gender + ", Address="
				+ Address + ", facemark=" + facemark + ", carea=" + carea + ", Crname=" + Crname + ", getCid()="
				+ getCid() + ", getCname()=" + getCname() + ", getCage()=" + getCage() + ", getGender()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", getFacemark()=" + getFacemark() + ", getCarea()=" + getCarea()
				+ ", getCrname()=" + getCrname() + "]";
	}
	
	

}
