/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

/**
 *
 * @author gmateome
 */
public class Evolucionar {
    
    public Evolucionar(){}
    
    public static void evolucion(Pokemon pokemon, Pokedex pokedex, Jugador player, int index){
        if(pokemon.getNextEvo()>0 && pokemon.getLv()>=pokemon.getNextEvoLV()){
            System.out.println("Anda!!! Tu "+pokemon.getName()+" está evolucionando a "+pokedex.getPokemons().get(pokemon.getNextEvo()-1).getName());
            double pokemonLV=pokemon.getLv();
            pokemon=pokedex.getPokemons().get(pokemon.getNextEvo()-1);
            pokemon.setLv(pokemonLV);
            player.getEquipo().changePokemon(pokemon, index);         
        }
    }
    
}
