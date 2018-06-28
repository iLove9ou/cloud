package com.cloud.gateway.controller;

import com.cloud.gateway.annotation.Sign;
import com.cloud.gateway.client.CreditBankLoanClient;
import com.cloud.gateway.format.Document;
import com.cloud.gateway.format.DocumentInput;
import com.cloud.gateway.manager.BankCreditBusinessManager;
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
    public Document apply_notify(@RequestBody DocumentInput input) {

        logger.info("apply_notify " + " request: " + new Gson().toJson(input));
        Document document = creditBankLoanClient.applyNotify(input);
        logger.info("apply_notify " + " response: " + new Gson().toJson(document));
        return document;
    }

    @PostMapping(value = "/approve_upload", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approve_upload(@RequestBody DocumentInput input) {
        logger.info("approve_upload " + " request: " + new Gson().toJson(input));
        Document document = creditBankLoanClient.approveUpload(input);
        logger.info("approve_upload " + "response: " + new Gson().toJson(document));
        return document;
    }

    @PostMapping(value = "/approveack_notify", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approveack_notify(@RequestBody DocumentInput input) {
        logger.info("approveack_notify " + " request: " + new Gson().toJson(input));
        Document document = creditBankLoanClient.approveackNotify(input);
        logger.info("approveack_notify " + "response: " + new Gson().toJson(document));
        return document;
    }

    @PostMapping(value = "/approveack_confirm", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document approveack_confirm(@RequestBody DocumentInput input) {
        logger.info("approveack_confirm " + " request: " + new Gson().toJson(input));
        Document document = creditBankLoanClient.approveackConfirm(input);
        logger.info("approveack_confirm " + "response: " + new Gson().toJson(document));
        return document;
    }
}
