/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Pessoa.Pessoa;

/**
 *
 * @author selma
 */
public class TestePessoa {

    public static void main(String[] args) {
       
         Pessoa p = new Pessoa();
        p.setNome("Henrique");
        p.setIdade(20);
        p.setCpf("123.456.789-00");

        // Testando com idade negativa
        p.setIdade(-5); // Deve exibir mensagem de erro e não alterar a idade
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade()); // Deve continuar 20
        System.out.println("CPF: " + p.getCpf());
    }
}
    
