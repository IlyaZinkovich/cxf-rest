package com.services.examples.service;

import com.services.examples.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/users")
@Produces("application/json")
public interface UserService {

	@GET
	@Path("/{id}")
	User get(@PathParam("id") String id);

}