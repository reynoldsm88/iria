package org.iria.test.applications.rest;

import org.iria.test.applications.rest.resources.IriaTestResource;

import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class IriaMain extends Application<IriaRestConfiguration> {

    @Override
    public void initialize( Bootstrap<IriaRestConfiguration> bootstrap ) {
        bootstrap.setConfigurationSourceProvider( new ResourceConfigurationSourceProvider() );
    }

    @Override
    public void run( IriaRestConfiguration configuration, Environment environment ) throws Exception {
        final IriaTestResource resource = new IriaTestResource( configuration.getGreeting() );

        environment.jersey().register( resource );
    }

    public static void main( String[] args ) throws Exception {
        new IriaMain().run( args );
    }

}
