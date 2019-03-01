package org.iria.test.applications.rest;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

/**
 * 
 * This is a dropwizard convention that will be loaded from a YAML file.
 * 
 * This is where enviornmental properties like JDBC connections etc can be configured
 *
 */
public class IriaRestConfiguration extends Configuration {

    @NotEmpty
    private String greeting;

    @JsonProperty
    public String getGreeting() {
        return greeting;
    }

    @JsonProperty
    public void setGreeting( String greeting ) {
        this.greeting = greeting;
    }

}