/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import java.util.Random;

/**
 *
 * @author gmateome
 */
public class CombatirR {
   
    Random numeroAleatorio = new Random();    
    Combatir combatir=new Combatir();
    
    public CombatirR(){}
    
    public void combate(Jugador player, Pokedex pokedex){
        System.out.println("Has comenzado a caminar por la hierba alta");
        int aleatorio = numeroAleatorio.nextInt(99);
        Pokemon aleatorioP = pokedex.getPokemons().get(aleatorio);
        aleatorioP.setLv(player.getEquipo().getPokemons().get(0).getLv());
        System.out.println("Ha aparecido un "+aleatorioP.getName()+" salvaje!");        
        if((combatir.resultado(aleatorioP,combatir.pokemonJ(player),pokedex,player))==true){
           Captura newCaptura = new Captura();
           newCaptura.capturar(player, aleatorioP);
        }

    }
    
    
}
