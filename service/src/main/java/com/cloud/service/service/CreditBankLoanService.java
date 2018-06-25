package com.cloud.service.service;

import com.cloud.service.model.request.MybankCreditLoanApplyNotifyRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveUploadRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackConfirmRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackNotifyRequest;
import com.cloud.service.model.response.MybankCreditLoanApplyNotifyResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveUploadResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackNotifyResponse;
import org.springframework.stereotype.Service;

@Service
public class CreditBankLoanService {

    /*
     * 初审通知请求，网商银行-银行机构
     */
    public MybankCreditLoanApplyNotifyResponse applyNotify(MybankCreditLoanApplyNotifyRequest request) {

        // TODO 发送请求
        return new MybankCreditLoanApplyNotifyResponse();
    }

    /*
     * 初审数据上传，银行机构-网商银行
     */
    public MybankCreditLoanApproveUploadResponse approveUpload(MybankCreditLoanApproveUploadRequest request) {

        // TODO 发送请求
        return new MybankCreditLoanApproveUploadResponse();
    }

    /*
     * 终审通知，网商银行-银行机构
     */
    public MybankCreditLoanApproveackNotifyResponse finalNotify(MybankCreditLoanApproveackNotifyRequest request) {

        // TODO 发送请求
        return new MybankCreditLoanApproveackNotifyResponse();
    }

    /*
     * 终审确认，银行机构-网商银行
     */
    public MybankCreditLoanApproveackNotifyResponse finalConfirm(MybankCreditLoanApproveackConfirmRequest request) {

        // TODO 发送请求
        return new MybankCreditLoanApproveackNotifyResponse();
    }

}
