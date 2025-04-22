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

        conta.setNumeroConta("12345-6");
        conta.setTitular("Yasmin Gonçalves");

        System.out.println("=== Dados da Conta ===");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        System.out.println("Realizando depósito de R$ 500,00...");
        conta.depositar(500);

        System.out.println("Tentando sacar R$ 200,00...");
        conta.sacar(200);

        System.out.println("Tentando sacar R$ 500,00 (sem saldo suficiente)...");
        conta.sacar(500);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
