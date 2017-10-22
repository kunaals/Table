package com.dubhacks.table;

public class TableResource {

    public void createStudent(Student student)
    {
        MongoHandler mongoHandler = new MongoHandler();
        mongoHandler.addStudentToDB(student);
    }

    public Student getStudent(String name)
    {
        return new Student("","","");
    }

    public String getTimes()
    {
        return "";
    }

}
