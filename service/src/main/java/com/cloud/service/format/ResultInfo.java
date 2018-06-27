package com.cloud.service.format;

import java.io.Serializable;

public class ResultInfo implements Serializable {

    private String resultCode;
    private String resultMsg;
    private String retry;

    public ResultInfo() {
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getRetry() {
        return retry;
    }

    public void setRetry(String retry) {
        this.retry = retry;
    }

}
