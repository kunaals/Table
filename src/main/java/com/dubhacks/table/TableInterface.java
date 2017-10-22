package com.dubhacks.table;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/table")
public class TableInterface
{
    TableResource tableResource = new TableResource();

    @Path("/students")
    @POST
    @Consumes("application/json")
    public void createStudent(Student student)
    {
        tableResource.createStudent(student);
    }

    @Path("/students/{name}")
    @GET
    @Produces("application/json")
    public Student getStudent(@PathParam("name") String name)
    {
        return tableResource.getStudent(name);
    }

    @Path("/times/{names}")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public String getTimes(@PathParam("names") List<String> names)
    {
        return tableResource.getTimes();
    }
}
