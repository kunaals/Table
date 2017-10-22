package com.dubhacks.table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mongodb.util.JSON;

import java.io.IOException;

public class TableResource {

    public void createStudent(Student student) throws JsonProcessingException {
        MongoHandler mongoHandler = new MongoHandler();
        mongoHandler.addStudentToDB(student);
    }

    public String getStudent(String name) throws IOException {
        MongoHandler mongoHandler = new MongoHandler();
        String JSONString = mongoHandler.getStudentJSONFromDB(name);
        return JSONString;
    }

    public String getTimes()
    {
        return "";
    }

}
