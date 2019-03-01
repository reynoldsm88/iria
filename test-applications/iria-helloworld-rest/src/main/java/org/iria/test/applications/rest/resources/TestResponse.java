package org.iria.test.applications.rest.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResponse {

    private String message;

    public TestResponse( String message ) {
        super();
        this.message = message;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage( String message ) {
        this.message = message;
    }

}