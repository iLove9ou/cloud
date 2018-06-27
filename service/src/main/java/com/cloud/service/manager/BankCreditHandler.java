package com.cloud.service.manager;


import com.cloud.service.constants.Constants;
import com.cloud.service.enums.CharsetEnum;
import com.cloud.service.enums.SignTypeEnum;
import com.cloud.service.format.*;
import com.cloud.service.utils.DateUtil;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BankCreditHandler {

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

}
