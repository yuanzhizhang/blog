package com.zyz.blog.entity;

import java.util.Date;

public class User {
    private int id;
    private String varchar;
    private String password;
    private String icon;
    private short admin;
    private Date create_time;

    public User() {
    }

    public User(int id, String varchar, String password, String icon, short admin, Date create_time) {
        this.id = id;
        this.varchar = varchar;
        this.password = password;
        this.icon = icon;
        this.admin = admin;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public short getAdmin() {
        return admin;
    }

    public void setAdmin(short admin) {
        this.admin = admin;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", varchar='" + varchar + '\'' +
                ", password='" + password + '\'' +
                ", icon='" + icon + '\'' +
                ", admin=" + admin +
                ", create_time=" + create_time +
                '}';
    }
}
