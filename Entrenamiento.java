
package my.pokemon.pokemon_diamante_online;

import static java.lang.Integer.parseInt;
import java.util.Scanner;


public class Entrenamiento {
    
    Scanner entrada=new Scanner(System.in);
    
    public Entrenamiento(){}
    
    public void entreno(Jugador player, Pokedex pokedex){
        int contador=0;
        int index=1;
        System.out.println("Elija su pokemon a entrenar");
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
        player.getEquipo().getPokemons().get(index).setLv(player.getEquipo().getPokemons().get(index).getLv()+0.5);
        System.out.println(player.getEquipo().getPokemons().get(index).getName()+" aumentó su nivel en +0.5");
        Evolucionar.evolucion(player.getEquipo().getPokemons().get(index), pokedex, player,index);
    }
    
}
