package com.ibm.cloudoe.samples;

public class User {
	public User(String id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public String id;
	public String username;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
