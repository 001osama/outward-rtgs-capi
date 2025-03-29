package webClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import dto.LoginRequestDto;
import dto.UserDto;

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
    @Path("/getallbranches")
    Response getAllBranches();
    
    @GET
    @Path("/getallcurrencies")
    Response getAllCurrencies();

    @GET
    @Path("/getallsbptrantypes")
    Response getSBPTranType();

    @GET
    @Path("/getallaccountnos")
    Response getAllAccounts(@QueryParam("customerNo") String customerNo);

    @GET
    @Path("/getaccountdetails")
    Response getAccountDetails(@QueryParam("accountNo") String accountNo);

}

