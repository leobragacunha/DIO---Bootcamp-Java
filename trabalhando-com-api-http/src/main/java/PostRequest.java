import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class PostRequest {

    public static final String URL_POST = "http://httpbin.org/forms/post";
    public static final String FILE = "D:/Biblioteca/Documentos/TI/Bootcamp-Java/DIO---Bootcamp-Java/trabalhando-com-api-http/pedido.json";


    public static void main(String[] args) throws IOException, InterruptedException {

        //Cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Criando a requisição
        HttpRequest request = HttpRequest.newBuilder()
                //.POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE)))
                .timeout(Duration.ofSeconds(20))
                .uri(URI.create(URL_POST))
                .build();

        //Criando a response
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();


    }

}
