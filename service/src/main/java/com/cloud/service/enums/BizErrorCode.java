package com.cloud.service.enums;

public enum BizErrorCode {

    /*
     * 默认成功返回码
     */
    SUCCESS("0000", "处理成功"),

    /*
     * 未定义的消息域
     */
    UNDEFINE_MSG_SCOPE("00001", "未定义的消息域"),

    /*
     * 报文中出现要求为R的参数缺失
     */
    UNDEFINE_PARAMS("0002", "必填域缺失"),

    /*
     * 无法识别关键域
     */
    NOT_RECOGNIZE_KEY_ITEM("0003", "无法识别关键域"),

    /*
     * 根据规范，一个或者多个域不符合格式要求
     */
    ITEM_FORMAT_ERROR("0004", "根据规范，一个或者多个域不符合格式要求"),

    /*
     * 签名无效
     */
    INVLID_SIGN("0007", "签名无效"),

    /*
     * 密钥不存在
     */
    PRIVATE_KEY_NOT_EXSITS("0008", "必填域缺失"),

    /*
     *  参数错误
     */
    PARAMS_ERROR("0011", "参数错误"),

    /*
     * 外部流水号为空
     */
    TRANS_NO_IS_EMPTY("0021", "外部流水号为空"),

    /*
     * 网关处理返回失败
     */
    CALL_GATEWAY_HANDLE_ERROR("0114", "网关处理返回失败"),

    /*
     * 未知系统异常
     */
    UNKNOW_SYSTEM_ERROR("9000", "未知系统异常"),

    /*
     * 报文时序错误
     */
    RESPONSE_ORDER_ERROR("9020", "报文时序错误"),
    ;

    private String code;
    private String message;


    BizErrorCode(String code, String message) {
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
