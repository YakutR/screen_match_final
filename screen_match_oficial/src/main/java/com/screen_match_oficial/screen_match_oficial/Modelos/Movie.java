package com.screen_match_oficial.screen_match_oficial.Modelos;

import com.screen_match_oficial.screen_match_oficial.Calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    //Construtor de Movie padronizado em Titulo
    public Movie(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    // pelo fato de implementar a interface Classificavel, tem que ter esse método
    @Override
    public int getClassificacao() {
        System.out.println("getClassificação do Movie" + ((int) obterMedia()/2));
        return (int) obterMedia()/2;
    }

    //reescrevendo o método toString da super classe Objects do Java
    @Override
    public String toString() {
        return "Filme "+this.getNome()+ " (" + this.getAnoDeLancamento() + ")";
    }

    

    
}
