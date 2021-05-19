package nika.mgaloblishvili.weather.nika_mgaloblishvili_davaleba_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {

    public String get(String path) throws Exception {
        URL url = new URL(String.format("http://localhost:8080/nika_mgaloblishvili_davaleba_1_war_exploded/api/%s", path));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200)
            throw new RuntimeException("HTTP error: " + conn.getResponseCode());

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        String output;
        StringBuilder reply = new StringBuilder();

        while ((output = br.readLine()) != null) {
            reply.append(output);
        }
        conn.disconnect();
        return reply.toString();
    }

}
