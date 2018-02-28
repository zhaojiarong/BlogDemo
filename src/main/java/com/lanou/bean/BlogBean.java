package com.lanou.bean;

/**
 * Created by dllo on 18/2/26.
 */
public class BlogBean {
    private Integer id;
    private String title;
    private String des;
    private String content;
    private Integer userId;

    public BlogBean() {
    }

    public BlogBean(Integer id, String title, String des, String content, Integer userId) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.content = content;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BlogBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
