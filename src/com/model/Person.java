package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private int pid;
	private String pname;
	private List<Long> contact;
	private Set<String> email;
	private Map<Integer,String>  address;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Long> getContact() {
		return contact;
	}
	public void setContact(List<Long> contact) {
		this.contact = contact;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<Integer, String> getAddress() {
		return address;
	}
	public void setAddress(Map<Integer, String> address) {
		this.address = address;
	}
	
}
