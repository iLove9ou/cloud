package cloudgateway.coudgateway.format;


public class Document {

    private Response response;
    private Signature signature;

    public Document() {
    }

    public Document(Response response, Signature signature) {
        this.response = response;
        this.signature = signature;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

}
