package cloudgateway.coudgateway.format;


public class Response {
    public Response(Head head, Body body) {
        this.head = head;
        this.body = body;
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
