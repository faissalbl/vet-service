package br.com.jcf.vet.resources;

import javax.ws.rs.core.Response.ResponseBuilder;

public class ResourceHelper {

	public static ResponseBuilder addCorsHeaders(ResponseBuilder responseBuilder) {
		return responseBuilder
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
	}

}
