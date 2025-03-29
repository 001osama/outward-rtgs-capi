package webClient;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import dto.LoginRequestDto;
import dto.UserDto;

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
    @Path("/getallbranches")
    Response getAllBranches();
    
    @GET
    @Path("/getallcurrencies")
    public Response getAllCurrencies();

    @GET
    @Path("/getallsbptrantypes")
    public Response getSBPTranType();

    @GET
    @Path("/getallaccountnos")
    public Response getAllAccounts(@QueryParam("customerNo") String customerNo);

    @GET
    @Path("/getaccountdetails")
    public Response getAccountDetails(@QueryParam("accountNo") String accountNo);

}

