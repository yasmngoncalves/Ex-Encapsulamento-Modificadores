/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.mediaAprovacao.teste;

import br.edu.etec.mediaAprovacao.model.Funcionario;

/**
 *
 * @author yasmn
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Yasmin Goncalves");
        f.setCargo("Desenvolvedora Frontend");

        f.setSalario(1200); 
        f.setSalario(2000); 

        System.out.println("Nome: " + f.getNome());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Salario: R$ " + f.getSalario());
    }
}
