package service;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import webClient.WebClient;
import dto.AuthorizeUserDto;
import dto.LoginRequestDto;
import dto.OutwardRTGSFormDto;
import dto.ReportFilterDto;
import dto.UserDto;
import dto.VoucherCancelDto;
import dto.VoucherDto;
import dto.VoucherInfoDto;
import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;


@ApplicationScoped
public class MainService {
    
    @Inject
    Logger logger;

    @Inject
    @RestClient
    WebClient webClient;

    public Response getUserInfo(LoginRequestDto loginRequestDto) {
        return webClient.getUserInfo(loginRequestDto); 
    }

    public Response createUser(UserDto user) {
       return webClient.createUser(user);
    }

    public Response getBranchesList() {
        return webClient.getBranchesList();
    }

    public Response getCurrencyList() {
        return webClient.getCurrencyList();
    }

    public Response getSBPTranTypeList() {
        return webClient.getSBPTranTypeList();
    }

    public Response getCustomerAccountNos(String customerNo) {
        return webClient.getCustomerAccountNos(customerNo);
    }

    public Response getAccountDetails(String accountNo) {
        return webClient.getAccountDetails(accountNo);
    }

    public Response getPurposeofPaymentList() {
        return webClient.getPurposeofPaymentList();
    }

    public Response getBeneficiaryBankList(String search) {
        return webClient.getBeneficiaryBankList(search);
    }

    public Response getBeneficairyAccountDetails(String accOrIban, String bankCode) {
        return webClient.getBeneficairyAccountDetails(accOrIban, bankCode);
    }

    public Response getExceptionList(String activityCode) {
        return webClient.getExceptionList(activityCode);
    }

    public Response getReasonList() {
        return webClient.getReasonList();
    }

    public Response getUnauthorizedOutwardRTGSList() {
        return webClient.getUnauthorizedOutwardRTGSList();
    }

    public Response isCancelVoucherExist(String voucherNo, String voucherYear ) {
        return webClient.isCancelVoucherExist(voucherNo, voucherYear);
    }


    public Response authorizeUser(AuthorizeUserDto authUserDto) {
        return webClient.authorizeUser(authUserDto);
    }

    public Response createOutwardRtgs(OutwardRTGSFormDto rtgsForm) {
        return webClient.createOutwardRtgs(rtgsForm);
    }

    public Response getOutwardRTGS(String voucherNo, String voucherYear ) {
        return webClient.getOutwardRTGS(voucherNo, voucherYear);
    }

    public Response cancelOutwardRtgs(VoucherCancelDto voucherDto) {
        return webClient.cancelOutwardRtgs(voucherDto);
    }

    public Response authorizeOutwardRtgs(VoucherInfoDto voucherInfo) {
        return webClient.authorizeOutwardRtgs(voucherInfo);
    }

    public Response validateCheque(String accountNo, String chequeNo, String chequeDate) {
        return webClient.validateCheque(accountNo, chequeNo, chequeDate);
    }

    public Response downloadRtgsReport(ReportFilterDto reportFilters) {
        return webClient.downloadRtgsReport(reportFilters);
    }

    public Response getVoucherReport(VoucherDto voucherInfo) {
        return webClient.getVoucherReport(voucherInfo);
    }



}
