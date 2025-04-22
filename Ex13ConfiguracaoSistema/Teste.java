/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ConfiguracaoSistema.teste;

import br.edu.etec.ConfiguracaoSistema.model.SubSistema;

/**
 *
 * @author musas
 */
public class Teste {
    public static void main(String[] args) {
        SubSistema s = new SubSistema("1.0.3");
        System.out.println(s.versaoSistema);
    }
}
