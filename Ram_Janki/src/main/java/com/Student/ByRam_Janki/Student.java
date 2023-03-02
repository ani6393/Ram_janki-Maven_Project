package com.Student.ByRam_Janki;

public class Student 
{
	private int Id;
	private String Name;
	private String Address;
	private Section clas;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public Section getClas() {
		return clas;
	}
	public void setClas(Section clas) {
		this.clas = clas;
	}
	

}
