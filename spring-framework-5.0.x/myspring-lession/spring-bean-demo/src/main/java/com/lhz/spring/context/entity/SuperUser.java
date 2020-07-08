package com.lhz.spring.context.entity;

/**
 * @author: lhz
 * @date: 2020/7/8
 **/
public class SuperUser extends User{
	private String address;

	public SuperUser() {
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SuperUser{" +
				"address='" + address + '\'' +
				"} " + super.toString();
	}
}