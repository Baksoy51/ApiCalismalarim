package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

    /*
        https://restful-booker.herokuapp.com/booking/256884 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
         */

    // 1- Gonderecegimiz request icin gerekli olan URL'i ve ihtiyacimiz varsa Body'i hazirliyoruz

    // 2- Eger soruda bize verilmisse Expected Data'yi hazirliyoruz

    //  3- bize donen responsi Actual data olarak kaydet
    //  4- Expected data ile Actual datanın karsilastirmasi Assertion yani

    @Test
    public void get01(){
          // 1- Gonderecegimiz request icin gerekli olan URL'i ve ihtiyacimiz varsa Body'i hazirliyoruz
     String url= "https://restful-booker.herokuapp.com/booking/3292";
         // 2- Eger soruda bize verilmisse Expected Data'yi hazirliyoruz

        //  3- bize donen responsi Actual data olarak kaydet

        Response response= given().when().get(url);

        response.prettyPrint();
        System.out.println("Status code: " + response.getStatusCode());
        System.out.println("contend type: " + response.getContentType());
        System.out.println("Header server: " + response.getHeader("Server"));
        System.out.println("Status line: " + response.getStatusLine());
        System.out.println("Response suresi: " + response.getTime());

        //  4- Expected data ile Actual datanın karsilastirmasi Assertion yani




    }
}
