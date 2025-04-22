/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.mediaAprovacao.teste;

import br.edu.etec.mediaAprovacao.model.ContaBancaria;

/**
 *
 * @author yasmn
 */
public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Configurando dados da conta
        conta.setTitular("Yasmin Gonçalves");
        conta.setNumeroConta("98765-4");

        System.out.println("🧾 Abertura de Conta");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("Primeiro depósito de R$ 1000,00");
        conta.depositar(1000);

        System.out.println("Tentando sacar R$ 300,00");
        conta.sacar(300);

        System.out.println("Tentando sacar R$ 800,00 (excedendo saldo)");
        conta.sacar(800);

        System.out.println("Tentando sacar R$ -50,00 (valor inválido)");
        conta.sacar(-50);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
