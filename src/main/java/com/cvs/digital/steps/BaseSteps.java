package com.cvs.digital.steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class BaseSteps {

    private Response response;

    public BaseSteps() {}

    public Response getRequestSample(String url) {
        response = SerenityRest.given()
                .contentType("application/json").when()
                .get(url);
        return response;
    }

    public String getSecretFromValut() {
        return "valueFromValut";
    }

    public void iShouldFindHTTPResponseStatus(Response response1, int statusCode) {
        response = response1;
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}