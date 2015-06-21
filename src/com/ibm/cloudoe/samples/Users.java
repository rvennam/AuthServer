package com.ibm.cloudoe.samples;

import java.util.HashMap;

public class Users {

	static HashMap<String, User> users = new HashMap<String, User>();
	
	public static void addUser(String id, String name){
		User newUser = new User(id, name);
		users.put(id, newUser);
	}
	
	public static void removeUser(String id){
		users.remove(id);
	}
	
	public static User getUser(String id){
		return users.get(id);
	}
	
	public static boolean checkUser(String id){
		return users.containsKey(id);
	}
	
}
