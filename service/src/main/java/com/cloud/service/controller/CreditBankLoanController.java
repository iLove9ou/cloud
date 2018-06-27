package com.cloud.service.controller;

import com.cloud.service.format.Document;
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
    public Document getUser(@RequestBody Document document) {
        return creditBankLoanService.applyNotify(document);
    }

    @RequestMapping(value = "/approveUpload")
    public Document approveUpload(@RequestBody Document document) {
        return creditBankLoanService.approveUpload(document);
    }

    @RequestMapping(value = "/approveackNotify")
    public Document approveackNotify(@RequestBody Document document) {
        return creditBankLoanService.finalNotify(document);
    }

    @RequestMapping(value = "/approveackConfirm")
    public Document approveackConfirm(@RequestBody Document document) {
        return creditBankLoanService.finalConfirm(document);
    }
}
