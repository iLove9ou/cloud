package cloudgateway.coudgateway.controller;

import cloudgateway.coudgateway.format.Document;
import cloudgateway.coudgateway.manager.BankCreditBusinessManager;
import cloudgateway.coudgateway.mq.Producer;
import cloudgateway.coudgateway.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {

    @Autowired
    private BankCreditBusinessManager bankCreditBusinessManager;

    @Autowired
    Producer producer;

    @PostMapping(value = "/credit_apply", consumes = "application/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Document creditApply(@RequestBody User user00) {
        System.out.println(user00.getId() + ":" + user00.getName());
        return bankCreditBusinessManager.getDocument();
    }

    @PostMapping(value = "/sendMsg")
    public Document sendMsg() {
        producer.send();

        return new Document();
    }
}
