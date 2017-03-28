/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Jogador;

/**
 *
 * @author Douglas
 */
public class Juiz {
    public static String avaliar(Jogador jogadorUm, Jogador jogadorDois){
        StringBuilder resultado = new StringBuilder();
        /*
        Regras:
            Se ambos forem iguais, empate
            Pedra ganha de Tesoura
            Tesoura ganha de Papel
            Papel ganha de Pedra
        */
        if(jogadorUm.getItem().getNome() == null){
            resultado.append("Jogador ").append(jogadorUm.getNome()).append(" deve fazer uma escolha: Pedra, Papel OU tesoura");
        }else if(jogadorDois.getItem().getNome() == null){
            resultado.append("Jogador ").append(jogadorDois.getNome()).append(" deve fazer uma escolha: Pedra, Papel OU tesoura");
        }else if( jogadorUm.getItem().getNome().equals(jogadorDois.getItem().getNome())){            
            resultado.append("Empate");
        }else if(jogadorUm.getItem().getNome().equals("Pedra")){
            if(jogadorDois.getItem().getNome().equals("Tesoura")){
                resultado.append("Vencedor: ").append(jogadorUm.getNome());                        
            }else{
                resultado.append("Vencedor: ").append(jogadorDois.getNome());
            }
        }else if(jogadorUm.getItem().getNome().equals("Tesoura")){
            if(jogadorDois.getItem().getNome().equals("Papel")){
                resultado.append("Vencedor: ").append(jogadorUm.getNome());                        
            }else{
                resultado.append("Vencedor: ").append(jogadorDois.getNome());
            }            
        }else{
            if(jogadorDois.getItem().getNome().equals("Pedra")){
                resultado.append("Vencedor: ").append(jogadorUm.getNome());                        
            }else{
                resultado.append("Vencedor: ").append(jogadorDois.getNome());
            }             
        }
        return resultado.toString();
    }
}
