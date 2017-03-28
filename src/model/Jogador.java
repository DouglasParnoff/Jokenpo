/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Douglas
 */
public class Jogador {
    private String nome;
    private Item item;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void jogar(){
        int escolha = (int) (Math.random() * 3);
        if(escolha == 0)            
            this.item = new Item("Pedra");
        else if(escolha == 1)
            this.item = new Item("Papel");
        else
            this.item = new Item("Tesoura");
        System.out.printf("%s - item escolhido: %s\n\n", this.nome, this.item.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }    
    
}
