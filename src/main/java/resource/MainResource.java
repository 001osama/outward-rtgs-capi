package resource;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dto.AuthorizeUserDto;
import dto.LoginRequestDto;
import dto.OutwardRTGSFormDto;
import dto.ReportFilterDto;
import dto.UserDto;
import dto.VoucherCancelDto;
import dto.VoucherDto;
import dto.VoucherInfoDto;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.MainService;

@Path("/capi") 
public class MainResource {


    @Inject
    MainService mainService;

    @POST
    @Path("/login")
    public Response login(LoginRequestDto user) 
    {
        return mainService.login(user);
    }


    @POST
    @Path("/createuser")
    public Response createUser(UserDto user) 
    {
        return mainService.createUser(user);
    }

    @POST
    @Path("/getuserinfo")
    public Response getUserInfo(LoginRequestDto loginRequest) 
    {
        return mainService.getUserInfo(loginRequest);
    }

    @GET
    @Path("/getbranchlist")
    public Response getBranchesList() 
    {
        return mainService.getBranchesList();    
    }

    @GET
    @Path("/getcurrencylist")
    public Response getCurrencyList() 
    {
        return mainService.getCurrencyList();
    }

    @GET
    @Path("/getsbptrantypelist")
    public Response getSBPTranTypeList()
    {
        return mainService.getSBPTranTypeList();
    }

    @GET
    @Path("/getcustomeraccountnos")
    public Response getCustomerAccountNos(@QueryParam("customerNo") String customerNo) 
    {
        return mainService.getCustomerAccountNos(customerNo);
    }

    @GET
    @Path("/getaccountdetails")
    public Response getAccountDetails(@QueryParam("accountNo") String accountNo)
    {
        return mainService.getAccountDetails(accountNo);
    }

    @GET
    @Path("/getpurposeofpaymentlist")
    public Response getPurposeofPaymentList()
    {
        return mainService.getPurposeofPaymentList();
    }

    @GET
    @Path("/getbeneficiarybanklist")
    public Response getBeneficiaryBankList(@QueryParam("searchTerm") String searchTerm)
    {
        return mainService.getBeneficiaryBankList(searchTerm);
    }

    @GET
    @Path("/getbeneficiaryaccountdetails")
    public Response getBeneficairyAccountDetails(
        @QueryParam("accOrIban") String accOrIban,
        @QueryParam("bankCode") String bankCode)
    {
        return mainService.getBeneficairyAccountDetails(accOrIban, bankCode);
    }

    @GET
    @Path("/getexceptionlist")
    public Response getExceptionList(@QueryParam("activityCode") String activityCode)
    {
        return mainService.getExceptionList(activityCode);
    }

    @GET
    @Path("/getreasonlist")
    public Response getReasonList()
    {
        return mainService.getReasonList();
    }

    @GET
    @Path("/getunauthorizedoutwardrtgslist")
    public Response getUnauthorizedOutwardRTGSList()
    {
        return mainService.getUnauthorizedOutwardRTGSList();
    }


    @GET
    @Path("/iscancelvoucherexist")
    public Response isCancelVoucherExist(
        @QueryParam("voucherNo") String voucherNo,
        @QueryParam("voucherYear") String voucherYear)
    {
        return mainService.isCancelVoucherExist(voucherNo, voucherYear);
    }


    @POST
    @Path("/authorizeUser")
    public Response authorizeUser(AuthorizeUserDto authUserDto) 
    {
        return mainService.authorizeUser(authUserDto);
    }


    //testing required
    @POST
    @Path("/createOutwardRtgs")
    public Response createOutwardRtgs(OutwardRTGSFormDto rtgsForm) 
    {
        return mainService.createOutwardRtgs(rtgsForm);
    }

    @GET
    @Path("/getOutwardRTGS")
    public Response getOutwardRTGS(
        @QueryParam("voucherNo") String voucherNo,
        @QueryParam("voucherYear") String voucherYear)
    {
        return mainService.getOutwardRTGS(voucherNo, voucherYear);
    }

    @POST
    @Path("/cancelOutwardRtgs")
    public Response cancelOutwardRtgs(VoucherCancelDto voucherDto) 
    {
        return mainService.cancelOutwardRtgs(voucherDto);
    }


    @POST
    @Path("/authorizeOutwardRtgs")
    public Response authorizeOutwardRtgs(VoucherInfoDto voucherInfo) 
    {
        return mainService.authorizeOutwardRtgs(voucherInfo);
    }


    @GET
    @Path("/validatecheque")
    public Response validateCheque(
        @QueryParam("accountNo") String accountNo,
        @QueryParam("chequeNo") String chequeNo, 
        @QueryParam("chequeDate") String chequeDate)
    {
        return mainService.validateCheque(accountNo, chequeNo, chequeDate);
    }


    @POST
    @Path("/downloadRtgsReport")
    public Response downloadRtgsReport(ReportFilterDto reportFilters) 
    {
        return mainService.downloadRtgsReport(reportFilters);
    }

    
    @POST
    @Path("/downloadVoucherReport")
    public Response getVoucherReport(VoucherDto voucherInfo) 
    {
        return mainService.getVoucherReport(voucherInfo);
    }
































}
