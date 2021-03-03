import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse; 
 class GitApi
{
    static void main(String[] args) 
    {
        def url="https://api.github.com/users/riteshscra";
        def request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        def client=HttpClient.newBuilder().build();
        def response=client.send(request, HttpResponse.BodyHandlers.ofString());
    
        println(response.statusCode());
        println(response.body());

 

    }
}
