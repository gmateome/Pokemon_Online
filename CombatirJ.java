/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gmateome
 */
public class CombatirJ {
    
    Scanner entrada=new Scanner(System.in);
    Combatir combatir=new Combatir();
    
    public CombatirJ(){}
    
    public void combate(Jugador player, Pokedex pokedex,ArrayList<Jugador> jugadores){
        System.out.println("A que jugador te deseas enfrentar?");
        Jugador enemy= new Jugador("","");
        if(jugadores.size()>1){
            for(Jugador j: jugadores){
                if (j!=player){
                    System.out.println(j.getUsername());
                }           
            }
                    
            boolean valido=true; 
            do{               
                if(valido==false){System.out.println("Jugador no encontrado. Introduca un nuevo nombre de usuario");}
                String opcion=entrada.nextLine();
                valido=false;
                for(Jugador j: jugadores){
                    if (opcion.equals(j.getUsername())&&!opcion.equals(player.getUsername())){
                        valido=true;
                        enemy=j;                        
                    }           
                }
            }while(valido==false);
            System.out.println("Elija al pokemon del jugador al que te quieres enfrentar");
            int contador=1;
            for(Pokemon p: enemy.getEquipo().getPokemons()){
                System.out.println(contador+": "+p.getName());
                contador++;
            }
            Pokemon enemyP = new Pokemon();
            do{
                if(valido==false){System.out.println("Opcion no válida");}
                String opcion=entrada.nextLine();
                valido=false;
                try{
                    if(parseInt(opcion)>0 && parseInt(opcion)<=contador){
                        valido=true;
                        enemyP = enemy.getEquipo().getPokemons().get(parseInt(opcion)-1);
                    }
                }catch(Exception e){}
            }while(valido==false);
            combatir.resultado(enemyP,combatir.pokemonJ(player),pokedex,player);            
        }else{
            System.out.println("No existen otros jugadores contra los que entfrentarse");
        }    
    }   
    
}
