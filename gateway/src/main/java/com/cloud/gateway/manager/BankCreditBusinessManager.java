package com.cloud.gateway.manager;

import com.cloud.gateway.client.UserServiceClient;
import com.cloud.gateway.constants.Constants;
import com.cloud.gateway.enums.CharsetEnum;
import com.cloud.gateway.enums.SignTypeEnum;
import com.cloud.gateway.format.*;
import com.cloud.gateway.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BankCreditBusinessManager {


    @Autowired
    private UserServiceClient userServiceClient;


    public Document getDocument() {

        Head head = new Head();
        head.setVersion("1.0.0");
        head.setSignType("RSA");
        head.setRespTime("20180909130908");
        head.setInputCharset("UTF-8");
        head.setAppId("GLBANK85");
        head.setFunction("com.mybank.cooperation.approveeak.notify");
        head.setReqMsgId("20180908120909");
        head.setReverse("");

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultCode("9020");
        resultInfo.setResultMsg("未找到授信申请信息");
        resultInfo.setRetry("Y");

        Body body = new Body();
        body.setApplyNo("2018090908124567890");
        body.setRequestId("3456723456783456782345678_f2fffdfghjkcccc990099hjk");
        body.setResultInfo(resultInfo);

        Signature signature = new Signature();
        signature.setSignature("signatute code ...");

        Response response = new Response(head, body);

        Document document = new Document();
        document.setResponse(response);
        document.setSignature(signature);
        return document;
    }

    public Document getDocuemnt(String appId,
                                String funcKey,
                                String sign,
                                ResultInfo resultInfo) {

        Head head = getHead(appId,
                funcKey,
                DateUtil.toDate(new Date()),
                "r");


        Body body = new Body();
        body.setApplyNo(DateUtil.toDate(new Date()));
        body.setRequestId(DateUtil.toDate(new Date()));
        body.setResultInfo(resultInfo);

        Signature signature = new Signature();
        signature.setSignature(sign);

        Response response = new Response(head, body);

        Document document = new Document();
        document.setResponse(response);
        document.setSignature(signature);
        return document;
    }

    private Head getHead(String appId, String function, String reqMsgId, String reverse) {
        Head head = new Head();
        head.setVersion(Constants.SYSTEM_VERSION);
        head.setSignType(SignTypeEnum.RSA.name());
        head.setRespTime(DateUtil.toDate(new Date()));
        head.setInputCharset(CharsetEnum.UTF8.name());
        head.setAppId(appId);
        head.setFunction(function);
        head.setReqMsgId(reqMsgId);
        head.setReverse(reverse);
        return head;
    }

    private Body getBody(String applyNo, String requestId, ResultInfo resultInfo) {
        Body body = new Body();
        body.setApplyNo(applyNo);
        body.setRequestId(requestId);
        body.setResultInfo(resultInfo);
        return body;
    }

    private Response getResponse(Head head, Body body) {
        return new Response(head, body);
    }

    private Document getDocument(Response response, Signature signature) {
        return new Document(response, signature);
    }
}
