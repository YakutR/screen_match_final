package com.screen_match_oficial.screen_match_oficial.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screen_match_oficial.screen_match_oficial.Excessao.ErroDeConversaoDeAnoException;
import com.screen_match_oficial.screen_match_oficial.Modelos.Titulo;
import com.screen_match_oficial.screen_match_oficial.Modelos.TituloOmdb;

public class PrincipalComBusca {
    // as Exceptions têm que existir para obter o response do Http
    public static void main(String[] args) throws IOException, InterruptedException, ErroDeConversaoDeAnoException {
        Scanner sc = new Scanner(System.in);
        String busca = "";
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        // construtor diferente para configurar uma política de campo de nome
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para a busca: ");
            busca = sc.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=18cb9d74";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());

            String json = response.body();
            System.out.println("\n" + json + "\n");// imprime o corpo da resposta do json

            // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);

                listaTitulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("\nAconteceu um erro: ");
                System.out.println(e.getMessage());

            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(listaTitulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(listaTitulos));
        escrita.close();

        System.out.println("\nO programa finalizou corretamente!");
        sc.close();
    }

}
