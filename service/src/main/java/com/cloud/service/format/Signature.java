package com.cloud.service.format;

import java.io.Serializable;

public class Signature implements Serializable {

    public Signature() {
    }

    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
