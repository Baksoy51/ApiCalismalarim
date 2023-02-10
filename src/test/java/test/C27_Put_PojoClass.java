package test;

import baseURL.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.POJOJsonPlaceHolder;

import static io.restassured.RestAssured.given;

public class C27_Put_PojoClass extends JsonPlaceHolderBaseUrl {
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
    Expected Body
    {
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":10,
    "id":70
    }
     */

    @Test
    public void put02(){

        specJsonPlace.pathParams("pp1","posts","pp2",70);
        
       POJOJsonPlaceHolder reqBody= new POJOJsonPlaceHolder
               ("Bunyamin","Merhaba",70,10);

      //  System.out.println("reqBody = " + reqBody);

        POJOJsonPlaceHolder expData=new POJOJsonPlaceHolder
                ("Bunyamin","Merhaba",70,10);

     //   System.out.println("expData = " + expData);

        Response response=given().
                spec(specJsonPlace).
                contentType(ContentType.JSON).when().body(reqBody).put("/{pp1}/{pp2}");
        
      //  response.prettyPrint();

        //4Assertion

       POJOJsonPlaceHolder resPojo=response.as(POJOJsonPlaceHolder.class);

       Assert.assertEquals(expData.getBody(),resPojo.getBody());

       /*
           echo "# ApiCalismalarim" >> README.md
          git init
          git add README.md
          git commit -m "first commit"
          git branch -M main
          git remote add origin https://github.com/Baksoy51/ApiCalismalarim.git
          git push -u origin ma
        */



    }
}
