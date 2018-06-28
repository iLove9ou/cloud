package com.cloud.service.service;

import com.cloud.service.enums.BizErrorCode;
import com.cloud.service.format.Document;
import com.cloud.service.format.DocumentInput;
import com.cloud.service.format.ResultInfo;
import com.cloud.service.manager.BankCreditHandler;
import com.cloud.service.model.response.MybankCreditLoanApplyNotifyResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveUploadResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackConfirmResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackNotifyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditBankLoanServiceImpl implements CreditBankLoanService {

    @Autowired
    private BankCreditHandler handler;
    /*
     * 初审通知请求，网商银行-银行机构
     */
    @Override
    public Document applyNotify(DocumentInput document) {

        // TODO 发送请求
        String appId = "app";
        String funcKey = "funcKey";
        String sign = "sign";
        ResultInfo info = new ResultInfo();
        info.setResultCode(BizErrorCode.INVLID_SIGN.getCode());
        info.setResultMsg(BizErrorCode.INVLID_SIGN.getMessage());
        return handler.getDocuemnt(appId, funcKey, sign, info);
    }

    /*
     * 初审数据上传，银行机构-网商银行
     */
    @Override
    public Document approveUpload(DocumentInput document) {

        // TODO 发送请求
        String appId = "app";
        String funcKey = "funcKey";
        String sign = "sign";
        ResultInfo info = new ResultInfo();
        info.setResultCode(BizErrorCode.SUCCESS.getCode());
        info.setResultMsg(BizErrorCode.SUCCESS.getMessage());
        return handler.getDocuemnt(appId, funcKey, sign, info);
    }

    /*
     * 终审通知，网商银行-银行机构
     */
    @Override
    public Document finalNotify(DocumentInput document) {

        // TODO 发送请求
        String appId = "app";
        String funcKey = "funcKey";
        String sign = "sign";
        ResultInfo info = new ResultInfo();
        info.setResultCode(BizErrorCode.NOT_RECOGNIZE_KEY_ITEM.getCode());
        info.setResultMsg(BizErrorCode.NOT_RECOGNIZE_KEY_ITEM.getMessage());
        return handler.getDocuemnt(appId, funcKey, sign, info);
    }

    /*
     * 终审确认，银行机构-网商银行
     */
    @Override
    public Document finalConfirm(DocumentInput document) {

        // TODO 发送请求
        String appId = "app";
        String funcKey = "funcKey";
        String sign = "sign";
        ResultInfo info = new ResultInfo();
        info.setResultCode(BizErrorCode.PARAMS_ERROR.getCode());
        info.setResultMsg(BizErrorCode.PARAMS_ERROR.getMessage());
        return handler.getDocuemnt(appId, funcKey, sign, info);
    }

}
