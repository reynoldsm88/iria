package org.iria.test.applications.rest.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IriaResourceObjectMapper {

    private static final ObjectMapper INSTANCE;

    static {
        INSTANCE = new ObjectMapper();
    }

    public static ObjectMapper getInstance() {
        return INSTANCE;
    }

}
