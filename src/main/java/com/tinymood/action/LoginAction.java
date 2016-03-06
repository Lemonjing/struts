package com.tinymood.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tinymood.pojo.User;

public class LoginAction extends ActionSupport {
	
	private User user;
	
	public String login() {
        System.out.println("=========");
        System.out.println(user.getUsername());
        System.out.println("=========");
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
