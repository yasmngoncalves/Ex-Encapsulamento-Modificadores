/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.mediaAprovacao.model;

/**
 *
 * @author yasmn
 */
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    // GETTERS
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // SETTERS (sem setSaldo!)
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // MÉTODO DEPOSITAR
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // MÉTODO SACAR (Ex. 10 – com verificação de saldo)
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor inválido. Saque não autorizado.");
        }
    }
    
}
