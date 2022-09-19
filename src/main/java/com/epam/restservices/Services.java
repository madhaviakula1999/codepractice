package com.epam.restservices;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Services {

	public void usingPathParam() {
		RestAssured.baseURI = "http://api.zippopotam.us";
        RequestSpecification httpsRequest = RestAssured.given();
        
        ResponseSpecBuilder response=  new ResponseSpecBuilder();
                response.expectStatusCode(200);
                response.expectStatusLine("HTTP/1.1 200 OK");
                response.expectContentType(ContentType.JSON);

        ResponseSpecification responseSpecification=response.build();

        httpsRequest.given()
		        .pathParam("countryCode", "us")
				.pathParam("zipCode", "90210")
                .spec(httpsRequest)
                .when().get("/{countryCode}/{zipCode}").
                then().spec(responseSpecification).log().all();
	}
}
