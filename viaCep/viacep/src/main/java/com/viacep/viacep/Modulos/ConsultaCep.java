package com.viacep.viacep.Modulos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConsultaCep {

    public Cep buscaEndereco(String cep){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        URI uri = URI.create("https://viacep.com.br/ws/"+cep+"/json");
		HttpRequest request = HttpRequest.newBuilder()
			.uri(uri)
			.build();
			
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client
            	.send(request, BodyHandlers.ofString());
            return gson.fromJson(response.body(), Cep.class);
        } catch (Exception e) {
            throw new RuntimeException("\nNão consegui obter o endereço a partir desse CEP.");
        }
    }

}
