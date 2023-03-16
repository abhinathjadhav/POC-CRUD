package org.poc.stored.controller;

import org.poc.stored.services.UserService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class UserController {

	UserService userService = new UserService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user")
	public Response getUser() {
		return userService.getAllUser();
	}
}
