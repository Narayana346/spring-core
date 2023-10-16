package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp")
	private Address address;

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address = " + address + "]";
	}

	public Emp(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting");
		this.address = address;
	}

}
