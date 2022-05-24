package com.ondinhk.nienluan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "info_most_76_house")
public class MostHouse {
    @Id
    private String id;
    @Field(value = "idHouse")
    private String idHouse;
    @Field(value = "title")
    private String title;
    @Field(value = "image")
    private String image;
    @Field(value = "description")
    private String description;
    @Field(value = "cost")
    private String cost;
    @Field(value = "quanlityComment")
    private int quanlityComment;
    @Field(value = "rate")
    private double rate;
    public MostHouse(){

    }
    public MostHouse(String idHouse, String title, String image, String description, String cost, int quanlityComment, double rate) {
        this.idHouse = idHouse;
        this.title = title;
        this.image = image;
        this.description = description;
        this.cost = cost;
        this.quanlityComment = quanlityComment;
        this.rate = rate;
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getQuanlityComment() {
        return quanlityComment;
    }

    public void setQuanlityComment(int quanlityComment) {
        this.quanlityComment = quanlityComment;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
