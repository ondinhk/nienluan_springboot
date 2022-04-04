package com.ondinhk.nienluan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "info_dalat")
public class Dalat {
    @Id
    private String id;
    @Field(value = "idHouse")
    private Long idHouse;
    @Field(value = "title")
    private String title;
    @Field(value = "linkBooking")
    private String linkBooking;
    @Field(value = "image")
    private String image;
    @Field(value = "description")
    private Object description;
    @Field(value = "distance")
    private String distance;
    @Field(value = "cost")
    private String cost;
    @Field(value = "rate")
    private String rate;
    @Field(value = "label_rate")
    private String label_rate;
    @Field(value = "quanlityComment")
    private String quanlityComment;
    public Dalat() {
    }

    public Dalat(Long idHouse, String title, String linkBooking, String image, Object description,
                 String distance, String cost, String rate, String label_rate, String quanlityComment) {
        this.idHouse = idHouse;
        this.title = title;
        this.linkBooking = linkBooking;
        this.image = image;
        this.description = description;
        this.distance = distance;
        this.cost = cost;
        this.rate = rate;
        this.label_rate = label_rate;
        this.quanlityComment = quanlityComment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkBooking() {
        return linkBooking;
    }

    public void setLinkBooking(String linkBooking) {
        this.linkBooking = linkBooking;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {

        this.distance = distance;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Long getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Long idHouse) {
        this.idHouse = idHouse;
    }

    public String getLabel_rate() {
        return label_rate;
    }

    public void setLabel_rate(String label_rate) {
        this.label_rate = label_rate;
    }

    public String getQuanlityComment() {
        return quanlityComment;
    }

    public void setQuanlityComment(String quanlityComment) {
        this.quanlityComment = quanlityComment;
    }
}
