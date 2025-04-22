/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.mediaAprovacao.model;

/**
 *
 * @author musas
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double n1) {
        this.nota1 = n1;
    }
    
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double n2) {
        this.nota2 = n2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    
    public boolean estaAprovado() {
        return calcularMedia() >= 6;
    }
}