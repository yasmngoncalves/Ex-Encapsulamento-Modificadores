/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Teste;

import br.edu.etec.meuprojeto.model.Produto;

/**
 *
 * @author selma
 */
public class TesteProduto {
    
    public static void main (String [] args){
        
        Produto p = new Produto();
        p.setNome("Java para Iniciantes");
        p.setPreco(142.00);
        p.setQuantidade(1);
       
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}
