package com.dubhacks.table;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty(value = "Name", required = true)
    private String name;
    @JsonProperty(value = "NetId", required = true)
    private String netId;
    @JsonProperty(value = "BitMask", required = true)
    private String bitMask;

    public Student(String name, String netId, String bitMask)
    {
        this.name = name;
        this.netId = netId;
        this.bitMask = bitMask;
    }
    @JsonAnySetter
    public void setName(String name)
    {
        this.name = name;
    }
    @JsonAnySetter
    public void setNetId(String netId)
    {
        this.netId = netId;
    }

    @JsonAnySetter
    public void setBitMask(String bitMask)
    {
        this.bitMask = bitMask;
    }

    @JsonAnyGetter
    public String getName()
    {
        return this.name;
    }

    @JsonAnyGetter
    public String getNetId()
    {
        return this.netId;
    }

    @JsonAnyGetter
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
