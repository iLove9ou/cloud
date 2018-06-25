package com.cloud.service.model.response;

import java.io.Serializable;

public class MybankCreditLoanApproveUploadResponse implements Serializable {
    /*
     * 请求幂等ID
     */
    private String requestId;

    /*
     * 申请编码
     */
    private String applyNo;

    /*
     * 返回结果
     */
    private Object resultInfo;


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

    public Object getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(Object resultInfo) {
        this.resultInfo = resultInfo;
    }
}
