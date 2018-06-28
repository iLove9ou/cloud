package com.cloud.gateway.client;

import com.cloud.gateway.format.Document;
import com.cloud.gateway.format.DocumentInput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-test")
public interface CreditBankLoanClient {

    @RequestMapping(value = "/applyNotify", method = RequestMethod.POST)
    public Document applyNotify(DocumentInput document);

    @RequestMapping(value = "/approveUpload", method = RequestMethod.POST)
    public Document approveUpload(DocumentInput document);

    @RequestMapping(value = "/approveackNotify", method = RequestMethod.POST)
    public Document approveackNotify(DocumentInput document);

    @RequestMapping(value = "/approveackConfirm", method = RequestMethod.POST)
    public Document approveackConfirm(DocumentInput document);
}
