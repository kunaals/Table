package com.dubhacks.table;

public class Student {

    private String name;
    private String netId;
    private String bitMask;

    public Student(String name, String netId, String bitMask)
    {
        this.name = name;
        this.netId = netId;
        this.bitMask = bitMask;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNetId(String netId)
    {
        this.netId = netId;
    }

    public void setBitMask(String bitMask)
    {
        this.bitMask = bitMask;
    }

    public String getName()
    {
        return this.name;
    }

    public String getNetId()
    {
        return this.netId;
    }

    public String getBitMask()
    {
        return this.bitMask;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", netId='" + netId + '\'' +
                '}';
    }
}
