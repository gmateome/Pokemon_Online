/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my.pokemon.pokemon_diamante_online;

import java.util.Scanner;

/**
 *
 * @author gmateome
 */
public class Pokemon_Diamante_Online {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        Server server = new Server();
        Jugador currentPlayer=new Jugador("","");

        String option;
        
        System.out.println("Bienvenido a pokemon Online");
        do{
            if(currentPlayer.getUsername().equals("")){
                System.out.println("**************************");
                System.out.println("Que desea hacer ahora? 1:LogIn      2:Registrarse       99:Salir");
                option=entrada.nextLine().toLowerCase();
                while(!option.equals("1")&&!option.equals("2")&&!option.equals("99")){
                    System.out.println("Opción no válida");
                    option=entrada.nextLine().toLowerCase();               
                }
                System.out.println("**************************");
                switch(option){
                        case "1":
                            currentPlayer=server.logIn();
                        break;
                        case "2":
                            server.addPlayer();
                        break;
                }
            }else{
                System.out.println("**************************");
                System.out.println("Logeado con el usuario "+currentPlayer.getUsername());
                System.out.println("Que desea hacer ahora? 1:Entrenar       2:Caminar por la hierba alta        3:Combatir contra un entrenador     4:Ver tu equipo     5:LogOut        99:Salir");
                option=entrada.nextLine().toLowerCase();
                while(!option.equals("1")&&!option.equals("2")&&!option.equals("3")&&!option.equals("4")&&!option.equals("5")&&!option.equals("99")){
                    System.out.println("Opción no válida");
                    option=entrada.nextLine().toLowerCase();
                }
                System.out.println("**************************");
                switch(option){
                    case "1":
                        Entrenamiento entrenar = new Entrenamiento();
                        entrenar.entreno(currentPlayer, server.getThisPokedex());
                    break;
                    case "2":
                        CombatirR combatirR = new CombatirR();
                        combatirR.combate(currentPlayer,server.getThisPokedex());                        
                    break;
                    case "3":
                        CombatirJ combatirJ = new CombatirJ();
                        combatirJ.combate(currentPlayer, server.getThisPokedex(), server.getJugadores());
                    break;
                    case "4":
                        int contador=1;
                        System.out.println("Este es su equipo Pokemon:");
                        for(Pokemon p:currentPlayer.getEquipo().getPokemons()){
                            System.out.println(contador+": "+p.getName()+"      lv: "+p.getLv());
                            contador++;
                        }
                    break;
                    case "5":
                        currentPlayer=new Jugador("","");
                    break;
                }
            }       
        }while(!option.equals("99"));
        
        
        
    }
}
