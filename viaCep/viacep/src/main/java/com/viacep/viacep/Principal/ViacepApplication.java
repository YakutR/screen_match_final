package com.viacep.viacep.Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import java.util.Scanner;



//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ViacepApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		//SpringApplication.run(ViacepApplication.class, args);
		// API: https://viacep.com.br/ws/03059030/json/
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu CEP (apenas os números): ");
		String cep = sc.nextLine();
		String uri = "https://viacep.com.br/ws/"+cep+"/json";
		System.out.println(uri);


		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create(uri))
			.build();
			
		HttpResponse<String> response = client
  			.send(request, BodyHandlers.ofString());

		String json = response.body();

		FileWriter docCep = new FileWriter("Cep.json");
		docCep.write(json);
		docCep.close();


		sc.close();
	}

}
