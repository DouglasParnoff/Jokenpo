/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.nio.charset.Charset;
import java.util.Random;
import model.Item;
import model.Jogador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class JuizTest {
    private Jogador jogadorUm = null;
    private Jogador jogadorDois = null;
    public JuizTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        jogadorUm = new Jogador("Teste" + (new String(array, Charset.forName("UTF-8"))));
        jogadorDois = new Jogador("Teste" + (new String(array, Charset.forName("UTF-8"))));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of avaliar method, of class Juiz.
     */
    @Test
    public void testaEmpate() {
        jogadorUm.setItem(new Item("PEDra")); // testando ignore case tb
        jogadorDois.setItem(new Item("Pedra"));        
        assertEquals("Empate", new Juiz().getVencedor(jogadorUm, jogadorDois));        
    }
    
    @Test
    public void testaVitoria(){
        testaVencedor("Pedra", "Tesoura");
        testaVencedor("Papel", "Pedra");
        testaVencedor("Tesoura", "Papel");
    }        
    
    @Test
    public void testaNulo(){
        jogadorUm.setItem(new Item(null));
        jogadorDois.setItem(new Item(null));
        assertEquals("Joguem novamente, pois um dos valores é inválido", 
                     new Juiz().getVencedor(jogadorUm, jogadorDois));
        jogadorUm.setItem(new Item("Diferente de null"));
        assertEquals("Joguem novamente, pois um dos valores é inválido", 
                     new Juiz().getVencedor(jogadorUm, jogadorDois));        
    }
    
    public void testaVencedor(String vencedor, String perdedor){
        jogadorUm.setItem(new Item(vencedor));
        jogadorDois.setItem(new Item(perdedor));        
        assertEquals(("Jogador 1 venceu: " + jogadorUm.getNome()), 
                     new Juiz().getVencedor(jogadorUm, jogadorDois));
        jogadorUm.setItem(new Item(perdedor));   // invertendo parâmetros
        jogadorDois.setItem(new Item(vencedor)); // invertendo parâmetros
        assertEquals(("Jogador 2 venceu: " + jogadorDois.getNome()), 
                     new Juiz().getVencedor(jogadorUm, jogadorDois));        
    }            
    
}
