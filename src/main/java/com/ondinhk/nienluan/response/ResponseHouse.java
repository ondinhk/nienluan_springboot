package com.ondinhk.nienluan.response;

public class ResponseHouse {
    private String statusString;
    private String messString;
    private Object info;
    private Object image;
    private Object comments;
    public ResponseHouse(){

    }

    public ResponseHouse(String statusString, String messString, Object info, Object image, Object comments) {
        this.statusString = statusString;
        this.messString = messString;
        this.info = info;
        this.image = image;
        this.comments = comments;
    }

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public String getMessString() {
        return messString;
    }

    public void setMessString(String messString) {
        this.messString = messString;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }
}
