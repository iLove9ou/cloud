package com.cloud.gateway.vo;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.Serializable;

public class MybankCreditLoanApproveackNotifyResponse implements Serializable {

    /*
     * 请求幂等ID
     */
    private String requestId;

    /*
     * 申请编码
     */
    private String applyNo;

    /*
     * 证件类型
     */
    private String certType;

    /*
     * 证件名称
     */
    private String certName;

    /*
     * 证件号
     */
    private String certNo;

    /*
     * 业务模式
     */
    private String businessModel;

    /*
     * 扩展字段
     */
    private JSONPObject extInfo;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public JSONPObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONPObject extInfo) {
        this.extInfo = extInfo;
    }
}
