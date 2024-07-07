package org.userManagement;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.response.ValidatableResponseOptions;



public class getUsers {

    @Test
    public void getUserData(){
        given().
                baseUri( "https://jsonplaceholder.typicode.com").
        when().
                get( "/posts/1").
        then().
                assertThat().
                statusCode( 200);
    }
}
