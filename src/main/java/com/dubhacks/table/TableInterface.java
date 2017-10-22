package com.dubhacks.table;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/table")
public class TableInterface
{
    @GET
    @Produces("application/json")
    public String hello()
    {
        return "";
    }
}
