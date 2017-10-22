package com.dubhacks.table;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoHandler {
    private static final MongoClient mongoClient = new MongoClient("54.212.240.228", 27017);
    private static final MongoDatabase mongoDatabase = mongoClient.getDatabase("noadmin");

    public void addStudentToDB(Student student)
    {
        MongoCollection<Document> collection = mongoDatabase.getCollection("users");
        Document document = new Document("title", "MongoDB")
                .append("id", 1)
                .append("description", "database")
                .append("likes", 100)
                .append("url", "http://www.tutorialspoint.com/mongodb/")
                .append("by", "tutorials point");
        collection.insertOne(document);
    }

    public Student getStudentFromDB(String name)
    {
        return new Student("","","");
    }

    public List<String> getBitMasksFromDB(List<String> names)
    {
        return new ArrayList<String>();
    }
}
