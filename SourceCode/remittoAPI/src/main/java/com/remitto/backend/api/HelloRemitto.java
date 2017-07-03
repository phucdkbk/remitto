package com.remitto.backend.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloRemitto {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrackInJSON() {

        return Response.status(201).entity("Hello remitto").build();

    }

}
