package com.zyz.blog.entity;

import java.util.Date;

public class Tag {
    private int id;
    private String name;
    private int blog_count;
    private Date create_time;

    public Tag() {
    }

    public Tag(int id, String name, int blog_count, Date create_time) {
        this.id = id;
        this.name = name;
        this.blog_count = blog_count;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlog_count() {
        return blog_count;
    }

    public void setBlog_count(int blog_count) {
        this.blog_count = blog_count;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blog_count=" + blog_count +
                ", create_time=" + create_time +
                '}';
    }
}
