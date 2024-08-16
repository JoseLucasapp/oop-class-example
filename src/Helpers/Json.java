package src.Helpers;

import org.json.JSONObject;

public class Json{
	public JSONObject createJson(String data){
        String[] parts = data.split(",");

        JSONObject json = new JSONObject();

        for (String part: parts){

            String[] keyValue = part.split(":");

            if(keyValue.length == 2){
                String key = keyValue[0];
                String value = keyValue[1];
                json.put(key, value);
            }
        }

        return json;
    }


}