package com.zyz.blog.entity;

import java.util.Date;

public class Blog {
    private int id;
    private String title;
    private String summay;
    private String content;
    private Date publish_date;
    private int column_id;
    private int views;
    private String tages;
    private String comments;
    private String blog_img;
    private short blog_state;
    private short admire_state;
    private short comment_state;
    private short recommend_state;
    private short reprint_state;
    private Date create_time;

    public Blog() {
    }

    public Blog(int id, String title, String summay, String content, Date publish_date, int column_id, int views, String tages, String comments, String blog_img, short blog_state, short admire_state, short comment_state, short recommend_state, short reprint_state, Date create_time) {
        this.id = id;
        this.title = title;
        this.summay = summay;
        this.content = content;
        this.publish_date = publish_date;
        this.column_id = column_id;
        this.views = views;
        this.tages = tages;
        this.comments = comments;
        this.blog_img = blog_img;
        this.blog_state = blog_state;
        this.admire_state = admire_state;
        this.comment_state = comment_state;
        this.recommend_state = recommend_state;
        this.reprint_state = reprint_state;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummay() {
        return summay;
    }

    public void setSummay(String summay) {
        this.summay = summay;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public int getColumn_id() {
        return column_id;
    }

    public void setColumn_id(int column_id) {
        this.column_id = column_id;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getTages() {
        return tages;
    }

    public void setTages(String tages) {
        this.tages = tages;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBlog_img() {
        return blog_img;
    }

    public void setBlog_img(String blog_img) {
        this.blog_img = blog_img;
    }

    public short getBlog_state() {
        return blog_state;
    }

    public void setBlog_state(short blog_state) {
        this.blog_state = blog_state;
    }

    public short getAdmire_state() {
        return admire_state;
    }

    public void setAdmire_state(short admire_state) {
        this.admire_state = admire_state;
    }

    public short getComment_state() {
        return comment_state;
    }

    public void setComment_state(short comment_state) {
        this.comment_state = comment_state;
    }

    public short getRecommend_state() {
        return recommend_state;
    }

    public void setRecommend_state(short recommend_state) {
        this.recommend_state = recommend_state;
    }

    public short getReprint_state() {
        return reprint_state;
    }

    public void setReprint_state(short reprint_state) {
        this.reprint_state = reprint_state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summay='" + summay + '\'' +
                ", content='" + content + '\'' +
                ", publish_date=" + publish_date +
                ", column_id=" + column_id +
                ", views=" + views +
                ", tages='" + tages + '\'' +
                ", comments='" + comments + '\'' +
                ", blog_img='" + blog_img + '\'' +
                ", blog_state=" + blog_state +
                ", admire_state=" + admire_state +
                ", comment_state=" + comment_state +
                ", recommend_state=" + recommend_state +
                ", reprint_state=" + reprint_state +
                ", create_time=" + create_time +
                '}';
    }
}
