package programmieren2.Threading;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;

public class TestHttp {

    public static void main(String[] args){
        HttpClient client = HttpClient.newHttpClient();

        /*HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://youtube.com"))
        .GET()
        .build();*/

        //HttpResponse response = client.send(request, BodyHandler<String>());
    }

}
