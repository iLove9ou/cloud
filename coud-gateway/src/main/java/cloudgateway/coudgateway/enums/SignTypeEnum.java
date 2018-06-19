package cloudgateway.coudgateway.enums;

public enum SignTypeEnum {

    RSA(1, "RSA");

    private Integer code;
    private String name;

    SignTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
