package com.screen_match_oficial.screen_match_oficial.Modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemp;
    private boolean ativa;
    private int minutosPorEp;

    //Construtor de Serie padrozinado em Titulo
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodiosPorTemp() {
        return episodiosPorTemp;
    }
    public void setEpisodiosPorTemp(int episodiosPorTemp) {
        this.episodiosPorTemp = episodiosPorTemp;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getMinutosPorEp() {
        return minutosPorEp;
    }
    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }
    // @Override é uma anotação que indica a subescritura de um método
    @Override //reescrever um método da classe mãe(Título) para especificar
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemp * minutosPorEp;
    }

    @Override
    public String toString() {
        return "Série: "+ getNome() + " (" + getAnoDeLancamento() + ")";
    }

}
