package com.screen_match_oficial.screen_match_oficial.principal;

import java.util.ArrayList;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.screen_match_oficial.screen_match_oficial.Modelos.Movie;
import com.screen_match_oficial.screen_match_oficial.Modelos.Serie;

//@SpringBootApplication
public class ScreenMatchTeste {

	public static void main(String[] args) {
		//SpringApplication.run(ScreenMatch2Application.class, args);
		Movie filme1 = new Movie("Filme1", 1990);
		Movie filme2 = new Movie("Filme2", 1991);
		Movie filme3 = new Movie("Filme3", 1992);
		Movie filme4 = new Movie("Filme4", 1993);		

		Serie serie1 = new Serie("Lost", 2022);
		Serie serie2 = new Serie("The 100", 2010);

		ArrayList<Movie> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filme1);
		listaDeFilmes.add(filme2);
		listaDeFilmes.add(filme3);
		listaDeFilmes.add(filme4);
		System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
		System.out.println("Primeiro filme: "+ listaDeFilmes.get(0).getNome());
		System.out.println("toString do primeiro filme: " + listaDeFilmes.get(0).toString());
		System.out.println("Lista completa: "+ listaDeFilmes);

		ArrayList<Serie> listaDeSeries = new ArrayList<>();
		listaDeSeries.add(serie1);
		listaDeSeries.add(serie2);
	}

}
