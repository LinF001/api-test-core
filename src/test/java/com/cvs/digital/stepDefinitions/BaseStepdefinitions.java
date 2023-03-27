package com.cvs.digital.stepDefinitions;

import com.cvs.digital.steps.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class BaseStepdefinitions {

    private BaseSteps baseSteps = new BaseSteps();
    private static final String GOOGLE_URL = "https://www.google.com";
    private Response response;

    @Given("^The valid google endpoint$")
    public void theValidGoogleEndpoint() {
        Assert.assertNotNull(GOOGLE_URL);
    }

    @When("^I send a get request to the google endpoint$")
    public void send_A_Get_Request_To_The_Endpoint() {
        response = baseSteps.getRequestSample(GOOGLE_URL);
        Assert.assertNotNull(response);
    }

    @Then("^Messages should come back to verify (.*)$")
    public void messages_Should_Come_Back_To_Verify(String urlName) {
        Assert.assertEquals("GOOGLE_URL", urlName);
    }

    @And("^Try to get secret from Vault$")
    public void tryToGetSecretFromVault() {
        String sct = baseSteps.getSecretFromValut();
        Assert.assertNotNull(sct);
    }

    /**
     * And verify code status.
     * @param code codeStatus
     */
    @And("^You should get (.*) code$")
    public void you_Should_Get_Status_Code(int code) {
        baseSteps.iShouldFindHTTPResponseStatus(response, code);
        Assert.assertEquals(200, response.getStatusCode());
    }
}
