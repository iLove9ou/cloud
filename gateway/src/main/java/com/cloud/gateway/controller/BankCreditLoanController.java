package com.cloud.gateway.controller;

import com.cloud.gateway.annotation.Sign;
import com.cloud.gateway.client.CreditBankLoanClient;
import com.cloud.gateway.client.UserServiceClient;
import com.cloud.gateway.format.Document;
import com.cloud.gateway.manager.BankCreditBusinessManager;
import com.cloud.gateway.mq.Producer;
import com.cloud.gateway.request.MybankCreditLoanApplyNotifyRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveUploadRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveackConfirmRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveackNotifyRequest;
import com.cloud.gateway.vo.*;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BankCreditLoanController {

    private final static Logger logger = LoggerFactory.getLogger(BankCreditLoanController.class);

    @Autowired
    private CreditBankLoanClient creditBankLoanClient;

    @Autowired
    private BankCreditBusinessManager manager;


    @PostMapping(value = "/apply_notify", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document apply_notify(@RequestBody MybankCreditLoanApplyNotifyRequest request) {
        MybankCreditLoanApplyNotifyResponse response = creditBankLoanClient.applyNotify(request);
        logger.info("apply_notify " + ": " + new Gson().toJson(response));
        return manager.getDocument();
    }

    @PostMapping(value = "/approve_upload", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approve_upload(@RequestBody MybankCreditLoanApproveUploadRequest request) {
        MybankCreditLoanApproveUploadResponse response = creditBankLoanClient.approveUpload(request);
        logger.info("approve_upload " + ": " + new Gson().toJson(response));
        return manager.getDocument();
    }

    @PostMapping(value = "/approveack_notify", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approveack_notify(@RequestBody MybankCreditLoanApproveackNotifyRequest request) {
        MybankCreditLoanApproveackNotifyResponse response = creditBankLoanClient.approveackNotify(request);
        logger.info("approveack_notify " + ": " + new Gson().toJson(response));
        return manager.getDocument();
    }

    @PostMapping(value = "/approveack_confirm", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approveack_confirm(@RequestBody MybankCreditLoanApproveackConfirmRequest request) {
        MybankCreditLoanApproveackConfirmResponse response = creditBankLoanClient.approveackConfirm(request);
        logger.info("apply_notify " + ": " + new Gson().toJson(response));
        return manager.getDocument();
    }
}
