/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.ValidarCEP.teste;

import br.edu.etec.ValidarCEP.model.Endereco;

/**
 *
 * @author musas
 */
public class EnderecoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endereco e = new Endereco();
        e.setRua("Rua 1");
        e.setBairro("Bairro 1");
        e.setCep("12345678");
        
        System.out.println("--Informações--");
        System.out.println("Rua: " + e.getRua());
        System.out.println("Bairro: " + e.getbairro());
        System.out.println("CEP: " + e.getCep());
        
        
        Endereco e2 = new Endereco();
        e2.setRua("Rua 2");
        e2.setBairro("Bairro 2");
        e2.setCep("12345");
        
        System.out.println("--Informações--");
        System.out.println("Rua: " + e2.getRua());
        System.out.println("Bairro: " + e2.getbairro());
        System.out.println("CEP: " + e2.getCep());
    }
    
}
