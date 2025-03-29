package service;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import webClient.WebClient;
import dto.LoginRequestDto;
import dto.UserDto;
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

    public Response getAllBranches() {
        return webClient.getAllBranches();
    }

    public Response getAllCurrencies() {
        return webClient.getAllCurrencies();
    }

    public Response getAllSBPTranTypes() {
        return getAllSBPTranTypes();
    }

    public Response getAllAccounts(String customerNo) {
        return getAllAccounts(customerNo);
    }

    public Response getAccountDetails(String accountNo) {
        return webClient.getAccountDetails(accountNo);
    }

}
