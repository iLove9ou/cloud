package com.cloud.gateway.client;

import com.cloud.gateway.format.Document;
import com.cloud.gateway.request.MybankCreditLoanApplyNotifyRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveUploadRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveackConfirmRequest;
import com.cloud.gateway.request.MybankCreditLoanApproveackNotifyRequest;
import com.cloud.gateway.vo.MybankCreditLoanApplyNotifyResponse;
import com.cloud.gateway.vo.MybankCreditLoanApproveUploadResponse;
import com.cloud.gateway.vo.MybankCreditLoanApproveackNotifyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-test")
public interface CreditBankLoanClient {

    @RequestMapping(value = "/applyNotify", method = RequestMethod.POST)
    public MybankCreditLoanApplyNotifyResponse applyNotify(MybankCreditLoanApplyNotifyRequest request);

    @RequestMapping(value = "/approveUpload", method = RequestMethod.POST)
    public MybankCreditLoanApproveUploadResponse approveUpload(MybankCreditLoanApproveUploadRequest request);

    @RequestMapping(value = "/approveackNotify", method = RequestMethod.POST)
    public MybankCreditLoanApproveackNotifyResponse approveackNotify(MybankCreditLoanApproveackNotifyRequest request);

    @RequestMapping(value = "/approveackConfirm", method = RequestMethod.POST)
    public com.cloud.gateway.vo.MybankCreditLoanApproveackConfirmResponse approveackConfirm(MybankCreditLoanApproveackConfirmRequest request);
}
