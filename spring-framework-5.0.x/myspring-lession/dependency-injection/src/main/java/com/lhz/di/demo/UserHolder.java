package com.lhz.di.demo;

import com.lhz.spring.context.entity.User;

/**
 * @author: lhz
 * @date: 2020/7/8
 **/
public class UserHolder {
	private User user;

	public UserHolder() {
	}

	public UserHolder(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserHolder{" +
				"user=" + user +
				'}';
	}
}
