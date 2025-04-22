/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Pessoa;


/**
 *
 * @author selma
 */
public class TestePessoa {
    
    public static void main (String [] args) {
        
        Pessoa p = new Pessoa ();
        p.setNome("Henrique");
        p.setIdade(20);
        p.setCpf("123.456.789-00");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("CPF: " + p.getCpf());
    }
    
}
