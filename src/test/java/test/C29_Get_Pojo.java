package test;

import baseURL.DummyBaseURL;
import org.junit.Test;
import pojos.PojoDummyData;
import pojos.PojoDummyExpectedData;

public class C29_Get_Pojo extends DummyBaseURL {

    /*
    http://dummy.restapiexample.com/api/v1/employee/3 url’ine bir GET request
     gonderdigimizde donen response’un asagidaki gibi oldugunu test edin.
    Response Body
    {
    "status":"success",
    "data":{
            "id":3,
            "employee_name":"Ashton Cox",
            "employee_salary":86000,
            "employee_age":66,
            "profile_image":""
            },
    "message":"Successfully!Record has been fetched."
    }
     */

    @Test
    public void get01(){

        specDummy.pathParams("pp1","employee","pp2",3);

        PojoDummyData data=new PojoDummyData(3,"Ashton Cox",86000,66,"");

    }
}
