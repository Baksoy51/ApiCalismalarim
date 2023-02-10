package testData;

import org.json.JSONObject;

import java.util.HashMap;

public class TestDataJsonPlaceHolder {

    public int basariliStatusCode=200;

    public JSONObject expectedBodyolusturJSON(){

        JSONObject expBodyJSon=new JSONObject();

        expBodyJSon.put("userId",3);
        expBodyJSon.put("id",22);
        expBodyJSon.put("title","dolor sint quo a velit explicabo quia nam");
        expBodyJSon.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis" +
                " non odio\nexpedita earum mollitia molestiae aut atque rem suscipit\nnam impedit esse");


        return expBodyJSon ;
    }
    public HashMap requestBodyOlusturMap() {
        HashMap<String, Object> requestBodyMap = new HashMap<>();

        requestBodyMap.put("title", "Ahmet");
        requestBodyMap.put("body", "Merhaba");
        requestBodyMap.put("userId", 10.0);
        requestBodyMap.put("id", 70.0);
        return requestBodyMap;
    }


}
