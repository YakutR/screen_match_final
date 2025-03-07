package com.screen_match_oficial.screen_match_oficial.Calculos;

import com.screen_match_oficial.screen_match_oficial.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // public void incluiTitulo(Movie f){
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }
    
    // public void incluiTitulo(Serie s){
    //     tempoTotal += s.getDuracaoEmMinutos();
    // }

    public void incluiTitulo(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
