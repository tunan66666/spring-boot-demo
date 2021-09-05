package com.tn666.demo.entity;

public class Blog {
    private Integer id;
    private String title;
    private String category;

    public Integer getId () {
        return this.id;
    }
    public void setId (Integer id) {
        this.id = id;
    }

    public String getTitle () {
        return this.title;
    }
    public void setTitle (String title) {
        this.title = title;
    }

    public String getCategory () {
        return this.category;
    }
    public void setCategory (String category) {
        this.category = category;
    }
    
}
