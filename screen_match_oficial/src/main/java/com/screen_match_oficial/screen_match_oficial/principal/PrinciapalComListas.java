package com.screen_match_oficial.screen_match_oficial.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.screen_match_oficial.screen_match_oficial.Modelos.Movie;
import com.screen_match_oficial.screen_match_oficial.Modelos.Serie;
import com.screen_match_oficial.screen_match_oficial.Modelos.Titulo;

public class PrinciapalComListas {
    public static void main(String[] args) {
        Movie filme1 = new Movie("Filme1", 1990);
		Movie filme2 = new Movie("Filme2", 1991);
		Movie filme3 = new Movie("Filme3", 1992);
		Movie filme4 = new Movie("Filme4", 1993);
        filme1.avalia(10);
        filme2.avalia(9);
        filme3.avalia(8);
        filme4.avalia(7);		

		Serie serie1 = new Serie("Lost", 2022);
		Serie serie2 = new Serie("The 100", 2010);

        //Parametrizei a lista com Titulo, para aceitar tudo que extender dessa classe
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(filme4);
        lista.add(serie1);
        lista.add(serie2);

        //Itera uma lista
        for (Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Movie filme) { //Confirma se titulo é uma instância de Movie e cria uma var referência
                System.out.println("Classificação: "+ filme.getClassificacao());    
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rodrigo");
        buscaPorArtista.add("Duda");
        buscaPorArtista.add("Adriana");
        buscaPorArtista.add("Flávio");
        System.out.println("\n"+ buscaPorArtista);
        Collections.sort(buscaPorArtista); //Ordena por ordem alfabética
        System.out.println("\nDepois de ordenar: "+buscaPorArtista);
        System.out.println("\nLista de títulos ordenados, com a interface Comparable:");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Utilizando a interface Comparator: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }

}
