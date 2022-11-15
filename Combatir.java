/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;


public class Combatir {
   
    Scanner entrada=new Scanner(System.in);
    Random numeroAleatorio = new Random();
    
    int index;
    
    public Combatir(){}
    
    public Pokemon pokemonJ(Jugador player){        
        int contador=0;
        index=1;
        System.out.println("A que pokemon desea sacar?");
        for(Pokemon p: player.getEquipo().getPokemons()){
            contador++;
            System.out.println(contador+": "+p.getName()+"      lv: "+p.getLv());
        }
        String opcion=entrada.nextLine();
        boolean valid=false;
        try{
            if(parseInt(opcion) <= contador&& parseInt(opcion)>0){
                valid=true;                
                index=parseInt(opcion)-1;
            }
        }catch(Exception e){}
        while(valid==false){
            System.out.println("Opcion no valida");
            opcion=entrada.nextLine();
            try{
                if(parseInt(opcion) <= contador&& parseInt(opcion)>0){
                    valid=true;
                    index=parseInt(opcion)-1;
                }
            }catch(Exception e){}
        }        
        Pokemon pokemonJ=player.getEquipo().getPokemons().get(index);               
        return pokemonJ;
    }
    
    public boolean resultado(Pokemon enemy, Pokemon pokemonJ, Pokedex pokedex, Jugador player){
        Tipos myTipos = new Tipos();
        double poder1 = pokedex.getPokemons().get(pokemonJ.getId()-1).getPower()*pokemonJ.getLv()*myTipos.getMultiplicador(pokemonJ,enemy)*pokemonJ.getEvo();
        double poder2 = pokedex.getPokemons().get(enemy.getId()-1).getPower()*enemy.getLv()*myTipos.getMultiplicador(enemy,pokemonJ)*enemy.getEvo();
        if(poder1>poder2){
            System.out.println(pokemonJ.getName()+" gana el combate por +"+(poder1-poder2)+" puntos de diferencia ("+poder1+"-"+poder2+") !!");
            System.out.println(pokemonJ.getName()+"Obtiene +2 lv");
            pokemonJ.setLv(pokemonJ.getLv()+2);
            return true;
        }else if(poder2>poder1){
            System.out.println(pokemonJ.getName()+" pierde el combate por -"+(poder1-poder2)+" puntos de diferencia ("+poder1+"-"+poder2+") !!");
            System.out.println(pokemonJ.getName()+"Obtiene +1 lv");
            pokemonJ.setLv(pokemonJ.getLv()+1);
            return false;
        }else{            
            if(numeroAleatorio.nextInt(2)==0){
                System.out.println(pokemonJ.getName()+" tuvo suerte y ganó el combate!");
                System.out.println(pokemonJ.getName()+"Obtiene +2 lv");
                pokemonJ.setLv(pokemonJ.getLv()+2);
                return true;
            }else{
                System.out.println(pokemonJ.getName()+" salió derrotado...");
                System.out.println(pokemonJ.getName()+"Obtiene +1 lv");
                pokemonJ.setLv(pokemonJ.getLv()+1);
                return false;
            }
        }
    
        
        
    }
    
}
