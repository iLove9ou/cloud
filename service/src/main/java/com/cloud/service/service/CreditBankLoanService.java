package com.cloud.service.service;

import com.cloud.service.format.Document;
import com.cloud.service.model.request.MybankCreditLoanApplyNotifyRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveUploadRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackConfirmRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackNotifyRequest;
import com.cloud.service.model.response.MybankCreditLoanApplyNotifyResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveUploadResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackConfirmResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackNotifyResponse;

public interface CreditBankLoanService {

    /*
     * 初审通知请求，网商银行-银行机构
     */
    public Document applyNotify(Document document);

    /*
     * 初审数据上传，银行机构-网商银行
     */
    public Document approveUpload(Document document);
    /*
     * 终审通知，网商银行-银行机构
     */
    public Document finalNotify(Document document);

    /*
     * 终审确认，银行机构-网商银行
     */
    public Document finalConfirm(Document document);

}
