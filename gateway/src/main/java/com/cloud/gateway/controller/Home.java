package com.cloud.gateway.controller;

import com.cloud.gateway.annotation.Sign;
import com.cloud.gateway.client.UserServiceClient;
import com.cloud.gateway.format.Document;
import com.cloud.gateway.manager.BankCreditBusinessManager;
import com.cloud.gateway.mq.Producer;
import com.cloud.gateway.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/*
 * just for test, it will be remove later
*/

@RestController
public class Home {

    private final static Logger logger = LoggerFactory.getLogger(Home.class);

    @Autowired
    private BankCreditBusinessManager bankCreditBusinessManager;

    @Autowired
    Producer producer;

    @Autowired
    private UserServiceClient userServiceClient;

    @PostMapping(value = "/credit_apply", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @Sign
    public Document creditApply(@RequestBody User user00) {
        logger.info(user00.getId() + ":" + user00.getName());
        return bankCreditBusinessManager.getDocument();
    }

    @PostMapping(value = "/sendMsg", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Document sendMsg() {
        producer.send();
        return new Document();
    }

    @PostMapping(value = "/getUser", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Document getUser() {
        userServiceClient.creditApply();
        return new Document();
    }
}
