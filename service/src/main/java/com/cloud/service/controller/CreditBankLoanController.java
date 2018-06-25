package com.cloud.service.controller;

import com.cloud.service.model.request.MybankCreditLoanApplyNotifyRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveUploadRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackConfirmRequest;
import com.cloud.service.model.request.MybankCreditLoanApproveackNotifyRequest;
import com.cloud.service.model.response.MybankCreditLoanApplyNotifyResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveUploadResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackConfirmResponse;
import com.cloud.service.model.response.MybankCreditLoanApproveackNotifyResponse;
import com.cloud.service.service.CreditBankLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditBankLoanController {

    @Autowired
    private CreditBankLoanService creditBankLoanService;

    @RequestMapping(value = "/applyNotify")
    public MybankCreditLoanApplyNotifyResponse getUser(@RequestBody MybankCreditLoanApplyNotifyRequest request) {
        return creditBankLoanService.applyNotify(request);
    }

    @RequestMapping(value = "/approveUpload")
    public MybankCreditLoanApproveUploadResponse approveUpload(@RequestBody MybankCreditLoanApproveUploadRequest request) {
        return creditBankLoanService.approveUpload(request);
    }

    @RequestMapping(value = "/approveackNotify")
    public MybankCreditLoanApproveackNotifyResponse approveackNotify(@RequestBody MybankCreditLoanApproveackNotifyRequest request) {
        return creditBankLoanService.finalNotify(request);
    }

    @RequestMapping(value = "/approveackConfirm")
    public MybankCreditLoanApproveackConfirmResponse approveackConfirm(@RequestBody MybankCreditLoanApproveackConfirmRequest request) {
        return creditBankLoanService.finalConfirm(request);
    }
}
