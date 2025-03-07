package com.screen_match_oficial.screen_match_oficial.Modelos;

import com.screen_match_oficial.screen_match_oficial.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie; //séria a qual este episodio pertence
    private int totalVisualizacoes;
    

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    @Override
    public int getClassificacao(){
        if (totalVisualizacoes >= 3000) {
            return 6;
        } else if (totalVisualizacoes <3000 && totalVisualizacoes >= 1000) {
            return 4;
        } else {
            return 2;
        }
    
    }
}
