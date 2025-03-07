package com.screen_match_oficial.screen_match_oficial.Calculos;

// usou interface, pois não poderia ser uma classe mãe de Movie, Serie e Episodios, pois já são filhas de Titulo
public interface Classificavel {
    int getClassificacao(); //na interface apenas fala o que quer fazer
    
}