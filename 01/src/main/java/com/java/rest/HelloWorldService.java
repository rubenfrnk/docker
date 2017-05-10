package com.java.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/message")
public class HelloWorldService {
	@GET
	@Path("/")
	public Response printMessage() {

		String result = "Hello World!! ";

		return Response.status(200).entity(result).build();
	}
}
