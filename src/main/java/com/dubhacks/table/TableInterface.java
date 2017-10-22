package com.dubhacks.table;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/table")
public class TableInterface
{
    TableResource tableResource = new TableResource();

    @Path("/students")
    @POST
    @Consumes("application/json")
    public void createStudent(Student student) throws JsonProcessingException {
        tableResource.createStudent(student);
    }

    @Path("/students/{name}")
    @GET
    @Produces("application/json")
    public String getStudent(@PathParam("name") String name) throws IOException {
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
