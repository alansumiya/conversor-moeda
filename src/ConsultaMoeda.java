import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moeda buscaMoeda(String moeda){
        String endereco = "https://v6.exchangerate-api.com/v6/ca6679722ac7403dad82425c/latest/" + moeda;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try{
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter a cotação da moeda através dessa sigla!");
        }
    }
}
