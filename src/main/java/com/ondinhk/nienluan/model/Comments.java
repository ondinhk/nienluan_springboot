package com.ondinhk.nienluan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dalat_comments")
public class Comments {
    @Id
    private String id;
    @Field(value = "idHouse")
    private Long idHouse;
    @Field(value = "username")
    private String username;
    @Field(value = "contry")
    private String contry;
    @Field(value = "title")
    private String title;
    @Field(value = "comment")
    private String comment;
    @Field(value = "scope")
    private String scope;

    public Comments(){

    }

    public Comments(Long idHouse, String username, String contry, String title, String comment, String scope) {
        this.idHouse = idHouse;
        this.username = username;
        this.contry = contry;
        this.title = title;
        this.comment = comment;
        this.scope = scope;
    }

    public Long getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Long idHouse) {
        this.idHouse = idHouse;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
