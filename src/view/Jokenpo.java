/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Juiz;
import java.util.HashMap;
import java.util.Map;
import model.Item;
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
        Jogador jogadorUm = new Jogador("Dean");
        Jogador jogadorDois = new Jogador("Sam");   
        jogadorUm.setItem(new Item("pedra"));
        jogadorDois.setItem(new Item("papel"));
        System.out.printf(">> RESULTADO >> %s\n", new Juiz().getVencedor(jogadorUm, jogadorDois));        
    }
    
    
}
