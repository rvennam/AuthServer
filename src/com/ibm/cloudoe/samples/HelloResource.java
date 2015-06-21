package com.ibm.cloudoe.samples;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;


@Path("/login")
public class HelloResource {

	@Context
	private HttpServletResponse response;
	  
	@GET
	public String getUsername(@QueryParam("userid") String userid, @Context HttpServletRequest req) {

		try {
			if(Users.getUser(userid)!=null){
				return Users.getUser(userid).getUsername();
			}
			else
				response.sendRedirect("/?redirectURL=" + req.getRequestURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "something went wrong!";
			
		}
		return "done";  

	}

	@POST
	public void login(@FormParam("username") String username, @FormParam("password") String password, @FormParam("redirectURL") String redirectURL) {
		//TODO: check username and password
		int randomId = (int )(Math.random() * 99999 + 1);
		Users.addUser(String.valueOf(randomId), username);
		System.out.println("added new user : " + randomId +" username is : " + username);
		try {
			response.sendRedirect(redirectURL + "?userID=" + randomId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}	
	}
	
	
	
	
}