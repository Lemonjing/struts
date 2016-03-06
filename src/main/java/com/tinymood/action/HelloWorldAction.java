package com.tinymood.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	public String add() {
		System.out.println("Add");
		
		return "add";
	}
	
	public String edit() {
		System.out.println("Edit");
		
		return "edit";
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("执行Action");
		
		return "success";
	}
	
	public String error() {
		System.out.println("Error");
		
		return "error";
	}
}
