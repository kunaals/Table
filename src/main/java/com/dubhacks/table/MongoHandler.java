package com.dubhacks.table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import jdk.nashorn.internal.parser.JSONParser;
import org.bson.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MongoHandler {
    private static final MongoClient mongoClient = new MongoClient("54.212.240.228", 27017);
    private static final MongoDatabase mongoDatabase = mongoClient.getDatabase("noadmin");

    public void addStudentToDB(Student student) throws JsonProcessingException {
        MongoCollection<Document> collection = mongoDatabase.getCollection("users");
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String jsonString = ow.writeValueAsString(student);
        Document document = Document.parse(jsonString);
        collection.insertOne(document);
    }

    public String getStudentJSONFromDB(String name) throws IOException {
        MongoCollection<Document> collection = mongoDatabase.getCollection("users");
        BasicDBObject nameQuery = new BasicDBObject();
        nameQuery.put("Name", name);
        MongoCursor<Document> dbCursor = collection.find(nameQuery).iterator();
        String JSONString = dbCursor.next().toJson();
        return JSONString;
    }

    public List<String> getBitMasksFromDB(List<String> names)
    {
        return new ArrayList<String>();
    }
}
