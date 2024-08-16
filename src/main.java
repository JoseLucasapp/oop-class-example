package src;

import org.json.JSONObject;
import src.Clients.module.Clients;
import src.Helpers.Json;

public class main {
    public static void main(String[] args){
        Clients client = new Clients("Lucas", "JL@gmail.com", "123", "123");

        Json jsonHelper = new Json();

        JSONObject json = jsonHelper.createJson(client.getData());
        System.out.println(json);
    }
}
