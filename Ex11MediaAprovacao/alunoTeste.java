/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.mediaAprovacao.teste;

import br.edu.etec.mediaAprovacao.model.Aluno;

/**
 *
 * @author musas
 */
public class alunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        a1.setNota1(7);
        a1.setNota2(9);
        
        System.out.println("--Dados do Aluno--");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Nota 1: " + a1.getNota1());
        System.out.println("Nota 2: " + a1.getNota2());
        System.out.println("Média: " + a1.calcularMedia());
        
        if (a1.estaAprovado()) {
            System.out.println("APROVADP");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
