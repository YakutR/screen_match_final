package com.viacep.viacep.Principal;

import java.io.IOException;
import java.util.Scanner;

import com.viacep.viacep.Modulos.Cep;
import com.viacep.viacep.Modulos.ConsultaCep;
import com.viacep.viacep.Modulos.GeradorDoc;

public class ViacepMain {
    public static void main(String[] args) {
        
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorDoc gerador = new GeradorDoc();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um CEP (apenas os números): ");
        var cep = sc.nextLine();

        try {
            Cep novoCep = consultaCep.buscaEndereco(cep);
            System.out.println(novoCep);
            gerador.GeradorDocumento(novoCep);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
        

        sc.close();
    }

}
