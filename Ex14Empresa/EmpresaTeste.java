/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Empresa.teste;

import br.edu.etec.Empresa.model.Empresa;

/**
 *
 * @author musas
 */
public class EmpresaTeste {
    public static void main(String[] args) {
        Empresa teste = new Empresa();
        teste.exibirInfo();
        // nao funcionara devido ao modificador
        teste.gerarRelatorio();
    }
}
