/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.mediaAprovacao.model;

/**
 *
 * @author yasmn
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario >= 1412.00) {
            this.salario = salario;
        } else {
            System.out.println("Erro: o salario deve ser igual ou maior que o salario minimo (R$ 1412,00).");
        }
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
