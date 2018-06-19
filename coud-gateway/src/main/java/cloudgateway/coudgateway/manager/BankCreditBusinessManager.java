package cloudgateway.coudgateway.manager;

import cloudgateway.coudgateway.business.BankCreditBusiness;
import cloudgateway.coudgateway.format.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankCreditBusinessManager {

    @Autowired
    private BankCreditBusiness bankCreditBusiness;

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

}
