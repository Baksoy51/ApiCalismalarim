package test;

import baseURL.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ResponseBilgileriAssertion {

    /*
        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request
        gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in "HTTP/1.1 200 OK"
        oldugunu test edin.
         */

    @Test
    public void get01(){

        // 1- Gonderecegimiz request icin gerekli olan URL'i ve ihtiyacimiz varsa Body'i hazirliyoruz

        String url="https://restful-booker.herokuapp.com/booking/2482";

        // 2- Eger soruda bize verilmisse Expected Data'yi hazirliyoruz


        //  3- bize donen responsi Actual data olarak kaydet

        Response response= given().when().get(url);

        response.prettyPrint();

        //  4- Expected data ile Actual datanın karsilastirmasi Assertion yani

        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                header("Server","Cowboy").
                statusLine("HTTP/1.1 200 OK");
    }




}
