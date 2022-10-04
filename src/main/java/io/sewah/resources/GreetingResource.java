package io.sewah.resources;
import org.jboss.resteasy.reactive.RestResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @Path("/addProduct/{productName}")
    @POST
    public RestResponse<String> addProduct(@PathParam("productName") String productName) {
        return RestResponse.ResponseBuilder.ok("Product with name: "+productName+", added successfully",MediaType.TEXT_PLAIN_TYPE).build();
    }
}