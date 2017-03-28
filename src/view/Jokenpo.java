/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Juiz;
import model.Jogador;

/**
 *
 * @author Douglas
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador jogadorUm = new Jogador("Dean");
        Jogador jogadorDois = new Jogador("Sam");   
        jogadorUm.jogar();
        jogadorDois.jogar();
        System.out.printf(">> RESULTADO: %s\n", Juiz.avaliar(jogadorUm, jogadorDois));            
    }
    
}
