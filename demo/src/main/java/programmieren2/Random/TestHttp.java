package programmieren2.Random;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TestHttp {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException{

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest firstRequest = HttpRequest.newBuilder()
            .uri(new URI("https://api.my-ip.io/v2/ip.json"))
            .GET()
            .build();

        HttpResponse<String> firstResponse = client.send(firstRequest, BodyHandlers.ofString());

        System.out.println(firstResponse.body());


    }

}
