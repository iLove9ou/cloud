package com.cloud.gateway.format;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "document")
public class DocumentInput {

    private Request request;
    private Signature signature;

    public DocumentInput() {
    }

    public DocumentInput(Request request, Signature signature) {
        this.request = request;
        this.signature = signature;
    }

    public Request getRequest() {
        return request;
    }

    @XmlElement
    public void setResponse(Request request) {
        this.request = request;
    }

    public Signature getSignature() {
        return signature;
    }

    @XmlElement
    public void setSignature(Signature signature) {
        this.signature = signature;
    }

}
