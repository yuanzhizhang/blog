package com.zyz.blog.entity;

import java.util.Date;

public class Column {
    private int id;
    private String name;
    private String infor;
    private int blog_count;
    private Date create_time;

    public Column() {
    }

    public Column(int id, String name, String infor, int blog_count, Date create_time) {
        this.id = id;
        this.name = name;
        this.infor = infor;
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

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
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
        return "Column{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", infor='" + infor + '\'' +
                ", blog_count=" + blog_count +
                ", create_time=" + create_time +
                '}';
    }
}
