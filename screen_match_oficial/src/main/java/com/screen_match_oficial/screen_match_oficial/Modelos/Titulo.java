package com.screen_match_oficial.screen_match_oficial.Modelos;

import com.screen_match_oficial.screen_match_oficial.Excessao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) throws ErroDeConversaoDeAnoException {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length()>4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, porque tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
        //TODO Auto-generated constructor stub
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int ano){
        this.anoDeLancamento = ano;
    }

    public void setDuracaoEmMinutos(int duracao){
        this.duracaoEmMinutos = duracao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do título: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double obterMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outrTitulo) {
        return this.getNome().compareTo(outrTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + " duracaoEmMinutos=" + duracaoEmMinutos + "])";
    }
    

}
