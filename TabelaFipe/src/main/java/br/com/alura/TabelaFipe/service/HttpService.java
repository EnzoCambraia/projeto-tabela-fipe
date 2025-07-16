package br.com.alura.TabelaFipe.service;

import br.com.alura.TabelaFipe.model.Marca;
import br.com.alura.TabelaFipe.model.TipoVeiculo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpService {

    private final HttpClient client;
    private final ObjectMapper mapper = new ObjectMapper();


    public HttpService(){
        this.client = HttpClient.newHttpClient();
    }

    public <T> T get(String url, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)) // conversão de string para URI
                .GET() // definir método HTTP
                .build(); // construir
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        return mapper.readValue(response.body(), responseType); //transformação da string(body) em objeto de tipo <T>

    }

}
