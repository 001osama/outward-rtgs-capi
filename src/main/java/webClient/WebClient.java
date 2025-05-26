package webClient;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dto.AuthorizeUserDto;
import dto.LoginRequestDto;
import dto.OutwardRTGSFormDto;
import dto.ReportFilterDto;
import dto.UserDto;
import dto.VoucherCancelDto;
import dto.VoucherDto;
import dto.VoucherInfoDto;

@RegisterRestClient
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface WebClient {

    @POST
    @Path("/createuser")
    Response createUser(UserDto user);

    @POST
    @Path("/getuserinfo")
    Response getUserInfo(LoginRequestDto loginRequest); 

    @GET
    @Path("/getbranchlist")
    public Response getBranchesList();
    
    @GET
    @Path("/getcurrencylist")
    public Response getCurrencyList();

    @GET
    @Path("/getsbptrantypelist")
    public Response getSBPTranTypeList();

    @GET
    @Path("/getcustomeraccountnos")
    Response getCustomerAccountNos(@QueryParam("customerNo") String customerNo);

    @GET
    @Path("/getaccountdetails")
    Response getAccountDetails(@QueryParam("accountNo") String accountNo);

    @GET
    @Path("/getpurposeofpaymentlist")                                                                                                      
    Response getPurposeofPaymentList();

    @GET
    @Path("/getbeneficiarybanklist")
    Response getBeneficiaryBankList(@QueryParam("searchTerm") String searchTerm);

    @GET
    @Path("/getbeneficiaryaccountdetails")
    Response getBeneficairyAccountDetails(
        @QueryParam("accOrIban") String accOrIban,
        @QueryParam("bankCode") String bankCode);


    @GET
    @Path("/getexceptionlist")
    Response getExceptionList(@QueryParam("activityCode") String activityCode);

    
    @GET
    @Path("/getreasonlist")
    Response getReasonList();

    @GET
    @Path("/getunauthorizedoutwardrtgslist")
    Response getUnauthorizedOutwardRTGSList();

    @GET
    @Path("/iscancelvoucherexist")
    Response isCancelVoucherExist(
        @QueryParam("voucherNo") String voucherNo,
        @QueryParam("voucherYear") String voucherYear);



    @POST
    @Path("/authorizeUser")
    Response authorizeUser(AuthorizeUserDto authUserDto);


    @POST
    @Path("/createOutwardRtgs")
    Response createOutwardRtgs(OutwardRTGSFormDto rtgsForm);

    @GET
    @Path("/getOutwardRTGS")
    Response getOutwardRTGS(
        @QueryParam("voucherNo") String voucherNo, 
        @QueryParam("voucherYear") String voucherYear); 


    @POST 
    @Path("/cancelOutwardRtgs")
    Response cancelOutwardRtgs(VoucherCancelDto voucherDto);   


    
    @POST 
    @Path("/authorizeOutwardRtgs")
    Response authorizeOutwardRtgs(VoucherInfoDto voucherInfo);


    @GET 
    @Path("/validatecheque")
    Response validateCheque(
        @QueryParam("accountNo") String accountNo,
        @QueryParam("chequeNo") String chequeNo, 
        @QueryParam("chequeDate") String chequeDate);


    
    @POST
    @Path("/downloadRtgsReport")
    @Produces("application/json")  
    Response downloadRtgsReport(ReportFilterDto reportFilters);  


    @POST
    @Path("/downloadVoucherReport")
    @Produces("application/json")  
    Response getVoucherReport(VoucherDto voucherInfo);


    



















}

