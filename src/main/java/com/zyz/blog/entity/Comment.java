package com.zyz.blog.entity;

import java.util.Date;

public class Comment {
    private int id;
    private String reply_name;
    private String reply_email;
    private int blog_id;
    private Date publish_date;
    private short blogger_state;
    private short msg_contend;
    private String reply_contend;
    private int parent_id;
    private Date create_time;

    public Comment() {
    }

    public Comment(int id, String reply_name, String reply_email, int blog_id, Date publish_date, short blogger_state, short msg_contend, String reply_contend, int parent_id, Date create_time) {
        this.id = id;
        this.reply_name = reply_name;
        this.reply_email = reply_email;
        this.blog_id = blog_id;
        this.publish_date = publish_date;
        this.blogger_state = blogger_state;
        this.msg_contend = msg_contend;
        this.reply_contend = reply_contend;
        this.parent_id = parent_id;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReply_name() {
        return reply_name;
    }

    public void setReply_name(String reply_name) {
        this.reply_name = reply_name;
    }

    public String getReply_email() {
        return reply_email;
    }

    public void setReply_email(String reply_email) {
        this.reply_email = reply_email;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public short getBlogger_state() {
        return blogger_state;
    }

    public void setBlogger_state(short blogger_state) {
        this.blogger_state = blogger_state;
    }

    public short getMsg_contend() {
        return msg_contend;
    }

    public void setMsg_contend(short msg_contend) {
        this.msg_contend = msg_contend;
    }

    public String getReply_contend() {
        return reply_contend;
    }

    public void setReply_contend(String reply_contend) {
        this.reply_contend = reply_contend;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", reply_name='" + reply_name + '\'' +
                ", reply_email='" + reply_email + '\'' +
                ", blog_id=" + blog_id +
                ", publish_date=" + publish_date +
                ", blogger_state=" + blogger_state +
                ", msg_contend=" + msg_contend +
                ", reply_contend='" + reply_contend + '\'' +
                ", parent_id=" + parent_id +
                ", create_time=" + create_time +
                '}';
    }
}
