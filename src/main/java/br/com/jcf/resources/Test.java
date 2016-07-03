package br.com.jcf.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("generic")
public class Test {
    @SuppressWarnings("unused")
    @Context
    private UriInfo context;

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Retrieves representation of an instance of Test
     * @return an instance of String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "meu teste";
    }

    /**
     * PUT method for updating or creating an instance of Test
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }

}