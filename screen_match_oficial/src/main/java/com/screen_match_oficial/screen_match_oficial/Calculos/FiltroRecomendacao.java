package com.screen_match_oficial.screen_match_oficial.Calculos;

public class FiltroRecomendacao {
//                      criando uma referência da interface e não um objeto da interface
    public void filtro(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 5) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 4) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }

}
