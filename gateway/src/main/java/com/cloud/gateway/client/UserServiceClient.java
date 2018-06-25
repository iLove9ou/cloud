package com.cloud.gateway.client;

import com.cloud.gateway.format.Document;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-test")
public interface UserServiceClient {

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public Document creditApply();
}
