package org.iria.test.applications.rest.resources;

import static java.lang.String.format;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.iria.test.applications.rest.serialization.IriaResourceObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path( "/iria/rest" )
@Consumes( MediaType.APPLICATION_JSON )
public class IriaTestResource {

    private final String greeting;
    private ObjectMapper mapper = IriaResourceObjectMapper.getInstance();

    public IriaTestResource( String greeting ) {
        this.greeting = greeting;
    }

    @POST
    public Response test( TestRequest request ) throws JsonProcessingException {
        String result = format( greeting, request.getName() );
        //@formatter:off
        return Response.status( 200 )
                .entity( mapper.writeValueAsBytes( new TestResponse(result) ) )
                .build();
        //@formatter:on
    }
}
