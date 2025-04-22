/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.Teste;

import br.edu.etec.meuprojeto.Model.Produto;

/**
 *
 * @author selma
 */
public class TesteProduto {
    
    public static void main (String [] args){
        
        Produto p = new Produto();
        
        p.setNome("java para Iniciantesw");
        p.setPreco(142.00);
        p.setQuantidade(1);
        
        //Teste com o preco(-10.00)
        p.setPreco(-10.00);
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preco: R$ " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
    
}