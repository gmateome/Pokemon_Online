/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    
    Scanner entrada=new Scanner(System.in);
    
    ArrayList <Pokemon> pokemons;
     int maxSize=6;
    
    public Equipo(){
        pokemons = new ArrayList <Pokemon>();
    }
    
    public void addPokemon(Pokemon pokemon){
        if (pokemons.size()==6){
            System.out.println("Su equipo está lleno. Que pokemon desea cambiar?");
            int contador=1;
            for(Pokemon p: pokemons){
                System.out.println(contador+": "+p.getName()+"      lv: "+p.getLv());
                contador++;
            }
            System.out.println("7: Cancelar y liberar al "+pokemon.getName());
            String opcion=entrada.nextLine();
            while(!opcion.equals("1")&&!opcion.equals("2")&&!opcion.equals("3")&&!opcion.equals("4")&&!opcion.equals("5")&&!opcion.equals("6")&&!opcion.equals("7")){
                System.out.println("Opcion no valida");
                opcion=entrada.nextLine();
            }
            if(!opcion.equals("7")){
                System.out.println("Adios "+pokemons.get(parseInt(opcion)-1).getName()+"!!!");
                pokemons.set(parseInt(opcion)-1, pokemon);
            }else{
                System.out.println("Has dejado a "+pokemon.getName()+" en libertad");
            }
        }else{
            pokemons.add(pokemon);
        }
        
    }

    public void changePokemon(Pokemon pokemon, int index){
        pokemons.set(index, pokemon);
    }
    
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
    
    
    
}
