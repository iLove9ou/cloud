package cloudgateway.coudgateway.enums;

public enum  ErrorCode {

    SUCCESS("0000", "处理成功"),
    UNDEFINE_MSG_SCOPE("00001", "未定义的消息域"),
    ;

    private String code;
    private String message;


    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
