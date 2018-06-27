package com.cloud.service.format;


import java.io.Serializable;

public class Response implements Serializable {

    public Response(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public Response() {
    }

    private Head head;
    private Body body;


    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

}
