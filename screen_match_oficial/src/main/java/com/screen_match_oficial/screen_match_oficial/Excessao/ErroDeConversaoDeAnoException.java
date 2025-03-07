package com.screen_match_oficial.screen_match_oficial.Excessao;

public class ErroDeConversaoDeAnoException extends Throwable {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage() {
        return this.mensagem;
    }

}
