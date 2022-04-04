package com.ondinhk.nienluan.response;

public class ResponseObject {
    private String statusString;
    private String messString;
    private Object[] data;

    public ResponseObject() {
    }

    public ResponseObject(String statusString, String messString, Object... args) {
        this.statusString = statusString;
        this.messString = messString;
        this.data = args;
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

    public Object getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
