/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gmateome
 */
public class Captura {
    
    Scanner entrada=new Scanner(System.in);
    
    public Captura(){}
    
    public void capturar(Jugador player, Pokemon pokemon){
        System.out.println("Quiere tratar de capturar al Pokemon? S/N");                
        String opcion=entrada.nextLine().toLowerCase();
        while(!opcion.equals("s")&&!opcion.equals("n")){
            System.out.println("La opcion elegida no es válida. Elija entre S/N");
            opcion=entrada.nextLine().toLowerCase();
        }
        if(opcion.equals("s")){
             System.out.println("Ha lanzado una pokeball:");
                Random numeroAleatorio = new Random();
                int random = numeroAleatorio.nextInt(2);
                try{
                if(random==1){
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("1...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("2...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Y...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Capturado!!");
                    TimeUnit.SECONDS.sleep(1);
                    player.getEquipo().addPokemon(pokemon);
                }else{
                    random = numeroAleatorio.nextInt(3);
                    for (int i=1;i<=random;i++){
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println(i+"...");
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("El pokemon se ha escapado:");
                }
                }catch(Exception e){}               
        }else{
         
        }
    }   
}
