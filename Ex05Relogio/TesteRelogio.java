/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.Model.Relogio;

/**
 *
 * @author selma
 */
public class TesteRelogio {
    
    public static void main (String[] args) {
        
        Relogio relogio = new Relogio();
        
        relogio.setMinuto(20);
        System.out.println(relogio.getMinuto());
    }
}
