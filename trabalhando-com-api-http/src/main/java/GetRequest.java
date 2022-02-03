
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GetRequest {

    public static final String URL_GET = "https://jsonplaceholder.typicode.com/posts";

    public static void main(String[] args) throws IOException, InterruptedException {

        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Criando a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(20))
                .uri(URI.create(URL_GET))
                .build();

        //Criando a response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Imprimindo a resposta
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }


}
