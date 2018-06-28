package com.cloud.gateway.format;

import java.io.Serializable;

public class Request implements Serializable {

    private Head head;
    private Body body;

    public Request() {
    }

    public Request(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

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
