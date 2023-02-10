package test;

import baseURL.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import testData.TestDataJsonPlaceHolder;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class C22_Put_DeSerialization extends JsonPlaceHolderBaseUrl {

    /*
    https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki
    body’e sahip bir PUT request yolladigimizda donen response’in
    response body’sinin asagida verilen ile ayni oldugunu test ediniz
    Request Body
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
    Expected Data :
        {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":10,
        "id":70
        }
     */

    @Test
    public void put01(){

        specJsonPlace.pathParams("pp1","posts","pp2",70);

        Map<String,Object>requestBodyMap=new HashMap<>();

        TestDataJsonPlaceHolder testDataJsonPlaceHolder=new TestDataJsonPlaceHolder();
        HashMap<String,Object> regBody= testDataJsonPlaceHolder.requestBodyOlusturMap();

        HashMap<String,Object> expData=testDataJsonPlaceHolder.requestBodyOlusturMap();
        Response response=given().
                spec(specJsonPlace).
                contentType(ContentType.JSON).
                when().body(regBody).
                put("/{pp1}/{pp2}");

        response.prettyPrint();

        //Assertion


        HashMap<String,Object> respMap= response.as(HashMap.class);

        Assert.assertEquals(testDataJsonPlaceHolder.basariliStatusCode,response.getStatusCode());
        Assert.assertEquals(expData.get("title"),respMap.get("title"));


    }
}
