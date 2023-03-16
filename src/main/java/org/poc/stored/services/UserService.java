package org.poc.stored.services;

import java.util.List;

import org.poc.stored.dao.UserDao;
import org.poc.stored.models.User;

import jakarta.ws.rs.core.Response;

public class UserService {

	UserDao userDao = new UserDao();
	public Response getAllUser() {
		// TODO Auto-generated method stub
		List<User> users = userDao.getAllUsers();
		return Response.ok(users).build();
	}

}
