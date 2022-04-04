package com.ondinhk.nienluan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dalat_images")
public class Images {
    @Id
    private String id;
    @Field(value = "idHouse")
    private Long idHouse;
    @Field(value = "imgLink")
    private String imgLink;

    public Images() {

    }

    public Images(Long idHouse, String imgLink) {
        this.idHouse = idHouse;
        this.imgLink = imgLink;
    }

    public Long getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Long idHouse) {
        this.idHouse = idHouse;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}
