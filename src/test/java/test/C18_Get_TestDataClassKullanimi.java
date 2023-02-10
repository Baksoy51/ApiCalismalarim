package test;

import baseURL.JsonPlaceHolderBaseUrl;
import org.json.JSONObject;
import org.junit.Test;

public class C18_Get_TestDataClassKullanimi extends JsonPlaceHolderBaseUrl {
    /*

https://jsonplaceholder.typicode.com/posts/22 url'ine bir GET
request yolladigimizda donen response'in status kodunun 200 ve
response body'sinin asagida verilen ile ayni oldugunu test ediniz

 Response body :
  {
  "userId":3,
  "id":22,
  "title":"dolor sint quo a velit explicabo quia nam",
  "body":"eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
  um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
  }
   */

    @Test
    public void get01(){

        // url hazırla

        specJsonPlace.pathParams("pp1","posts","pp2",22);

        //2- expected data hazırla

        JSONObject expBodyJSon=new JSONObject();

        expBodyJSon.put("userId",3);
        expBodyJSon.put("id",22);
        expBodyJSon.put("title","dolor sint quo a velit explicabo quia nam");
        expBodyJSon.put("body","body\",\"eos qui et ipsum ipsam suscipit aut\\nsed omnis non odio\\nexpedita ear \" +\n" +
                "\"um mollitia molestiae aut atque rem suscipit\\nnam impedit esse");

    }
}
