package com.example.cricliv;

public class Emp {

    private String name;
    private String id;
    private String job;
    private String createdAt;

    public Emp(String name, String id, String job, String createdAt) {
        this.name = name;
        this.id = id;
        this.job = job;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
