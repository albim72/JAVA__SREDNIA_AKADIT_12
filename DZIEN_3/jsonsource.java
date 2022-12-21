import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        JSONObject jo = new JSONObject();
        jo.put("firstName","Janek");
        jo.put("lastName","Kot");
        jo.put("age",40);

        Map m = new LinkedHashMap(4);
        m.put("streetAddress","Bursztynowa 45/3");
        m.put("city","Lublin");
        m.put("state","lubelskie");
        m.put("postalCode",20678);

        jo.put("address",m);

        JSONObject jam = new JSONObject();
        m = new LinkedHashMap(2);
        m.put("type","home");
        m.put("number","81 756-89-10");
        jam.put("phone",m);

        jo.put("phoneNumbers",jam);

        String sttw = "pierwsza linia";
        PrintWriter prw  = new PrintWriter("mojedane.json");

        prw.write(jo.toString());
                
        prw.close();
        System.out.println(jo);



    }
}
