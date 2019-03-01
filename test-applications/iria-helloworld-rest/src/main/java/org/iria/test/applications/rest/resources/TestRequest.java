package org.iria.test.applications.rest.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestRequest {

    private String name;

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName( String name ) {
        this.name = name;
    }

}
