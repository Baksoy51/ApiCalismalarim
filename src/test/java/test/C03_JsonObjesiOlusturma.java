package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

    /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
    {
        "title":"Ahmet",
        "body":"Merhaba",
        "userId":1
    }
*/

    @Test
    public void jsonObje01(){

        JSONObject ilkJsonObje= new JSONObject();

        ilkJsonObje.put("title;" ,"Bunyamin");
        ilkJsonObje.put("body","merhaba");
        ilkJsonObje.put("userId", 51);
        System.out.println(ilkJsonObje);
    }

    @Test
    public void jsonObje02(){
        /*
                {
                 "firstname":"Jim",
                 "additionalneeds":"Breakfast",
                 "bookingdates":{
                         "checkin":"2018-01-01",
                         "checkout":"2019-01-01"
                    },
                  "totalprice":111,
                  "depositpaid":true,
                  "lastname":"Brown"
                  }
         */

        JSONObject innerJsonObje=new JSONObject();

        innerJsonObje.put("checkin","2018-01-01");
        innerJsonObje.put("checkout","2019-01-01");

        JSONObject body= new JSONObject();

        body.put("firstname","Sibel");
        body.put("additionalneeds","Breakfast");
        body.put("bookingdates",innerJsonObje);
        body.put("totalprice",555);
        body.put("depositpaid",true);
        body.put("lastname","Sari");
        System.out.println(body);
    }
}
