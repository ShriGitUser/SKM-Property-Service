package com.skm.property.utils;

public class PropertyURIConstants {


    //GET
    public static final String HEALTH_CHECK = "/healthcheck";
    public static final String GET_PROPERTY = "/property/{id}";
    public static final String GET_ALL_PROPERTIES = "/properties";

    //POST
    public static final String CREATE_PROPERTY = "/property/create";
    public static final String UPDATE_PROPERTY = "/property/update/{id}";

    //PUT
    public static final String DELETE_PROPERTY = "/property/delete/{id}";




    //Best Practices for REST URI's, Example implemented in version 2
    //GET retrieves resources
    public static final String GET_ALL_THE_PROPERTIES = "/properties";
    public static final String GET_ONE_OF_THE_PROPERTY = "/properties/{id}";
    public static final String GET_ALL_PROPERTY_OWNERS = "/properties/{id}/owners";
    //POST submits new data to the server.
    public static final String POST_CREATE_PROPERTY = "/properties";
    //PUT updates existing data.
    public static final String PUT_UPDATE_ONE_PROPERTY = "/properties/{id}";
    //DELETE removes data.
    public static final String DELETE_DELETE_ONE_PROPERTY = "/properties/{id}";
}
