package resource;

import dto.LoginRequestDto;
import dto.UserDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import service.MainService;


@Path("/capi")
public class MainResource {


    @Inject
    MainService mainService;

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
    @Path("/getallbranches")
    public Response getAllBranches() 
    {
        return mainService.getAllBranches();    
    }

    @GET
    @Path("/getallcurrencies")
    public Response getAllCurrencies() 
    {
        return mainService.getAllCurrencies();
    }

    @GET
    @Path("/getallsbptrantypes")
    public Response getAllSBPTranTypes()
    {
        return mainService.getAllSBPTranTypes();
    }

    @GET
    @Path("/getallaccountnos")
    public Response getAllAccounts(@QueryParam("customerNo") String customerNo) 
    {
        return mainService.getAllAccounts(customerNo);
    }

    @GET
    @Path("/getaccountdetails")
    public Response getAccountDetails(@QueryParam("accountNo") String accountNo)
    {
        return mainService.getAccountDetails(accountNo);
    }
}
