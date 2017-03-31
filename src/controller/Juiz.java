/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.Jogador;

/**
 *
 * @author Douglas
 */
public class Juiz {
    
    private static Map<String, String> map;
    private static String PEDRA, PAPEL, TESOURA;
    
    public Juiz(){
        PEDRA = "pedra";
        PAPEL = "papel";
        TESOURA = "tesoura";
        map = new HashMap<>();
        map.put(PEDRA, TESOURA); /* chave: vence, valor: perde */
        map.put(PAPEL, PEDRA);   /* chave: vence, valor: perde */
        map.put(TESOURA, PAPEL); /* chave: vence, valor: perde */            
    }
        
    public static String getVencedor(Jogador jogadorUm, Jogador jogadorDois){
        /*
        Regras:
            Se ambos forem iguais, empate
            Pedra ganha de Tesoura
            Tesoura ganha de Papel
            Papel ganha de Pedra
        */
        if(jogadorUm.getItem().getNome() == null  || jogadorDois.getItem().getNome() == null  
                || map.get(jogadorUm.getItem().getNome().toLowerCase()) == null 
                || map.get(jogadorDois.getItem().getNome().toLowerCase()) == null) // se parâmetro de escolha vier como null, também pega
            return "Joguem novamente, pois um dos valores é inválido"; // para melhorar a resposta ao usuário, seria necessário separar os condicionais, para então saber e poder apontar quem escolheu errado
        if(jogadorUm.getItem().getNome().equalsIgnoreCase(jogadorDois.getItem().getNome()))
            return "Empate";        
        if(map.get(jogadorUm.getItem().getNome().toLowerCase()).equalsIgnoreCase(jogadorDois.getItem().getNome())) // se existe a chave no map e o valor é igual ao do outro jogador
            return "Jogador 1 venceu: " + jogadorUm.getNome();
        if(map.get(jogadorDois.getItem().getNome().toLowerCase()).equalsIgnoreCase(jogadorUm.getItem().getNome()))
            return "Jogador 2 venceu: " + jogadorDois.getNome();
        return "Ninguém venceu";        
    }
}
