package com.springcore.springcore.collections;
import java.util.*;
public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	public Emp() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ",\n phones=" + phones + ",\n addresses=" + addresses + ",\n courses=" + courses + "]";
	}
	

}