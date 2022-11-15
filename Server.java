/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    
    Scanner entrada=new Scanner(System.in);
    Pokedex thisPokedex = new Pokedex();
    
    ArrayList <Jugador> jugadores;
    
    public Server(){
        jugadores = new ArrayList <Jugador>();        
    }
    
    public void addPlayer(){
        String username="";
        String password="";
        System.out.println("Introduzca su nombre de usuario");               
        username=entrada.nextLine();
        boolean valido=true;        
        for(Jugador j: jugadores){
            if(j.getUsername().equals(username)){
                valido=false;
            }
        }       
        while(valido==false){
           System.out.println("El nombre de usuario ya existe. Introduzca uno nuevo");
           username=entrada.nextLine();
           valido=true;        
            for(Jugador j2: jugadores){
                if(j2.getUsername().equals(username)){
                    valido=false;
                }
            }     
        }              
        System.out.println("Introduzca su contraseña"); 
        password=entrada.nextLine();
        Jugador tempPlayer = new Jugador(username,password);
        System.out.println("Usuario registrado correctamente");
        int numeroPokedex=1;
        Pokemon inicialP;
        System.out.println("El profesor Oak le hace entrega de su Pokemon inicial: 1:Bulbasaur      2:Charmander        3:Squirtle");
        String inicial=entrada.nextLine().toLowerCase();
        while(!inicial.equals("1")&&!inicial.equals("2")&&!inicial.equals("3")){
            System.out.println("Opción no válida");
            inicial=entrada.nextLine().toLowerCase();
        }
        switch(inicial){
            case "1":
                numeroPokedex=1;
            break;   
            case "2":
                numeroPokedex=4;
            break; 
            case "3":
                numeroPokedex=7;
            break; 
        }
        tempPlayer.getEquipo().addPokemon(thisPokedex.getPokemons().get(numeroPokedex-1));
        tempPlayer.getEquipo().getPokemons().get(0).setLv(5);
        System.out.println("Ha elegido a "+thisPokedex.getPokemons().get(numeroPokedex-1).getName());
        jugadores.add(tempPlayer);                
    }
    
    public Jugador logIn(){
        Jugador jugador = new Jugador("","");
        System.out.println("Introduzca su nombre de usuario");               
        String username=entrada.nextLine();
        System.out.println("Introduzca su contraseña");               
        String password=entrada.nextLine();
        boolean valido=false;        
        for(Jugador j: jugadores){
            if(j.getUsername().equals(username)&&j.getPassword().equals(password)){
                valido=true;
                jugador=j;
            }
        }
        int contador=0;
        while(valido==false && contador<3){
            contador++;
            System.out.println("Error con sus credenciales de acceso. Intento:"+contador);
            System.out.println("Introduzca su nombre de usuario");               
            username=entrada.nextLine();
            System.out.println("Introduzca su contraseña");               
            password=entrada.nextLine();       
            for(Jugador j: jugadores){
                if(j.getUsername().equals(username)&&j.getPassword().equals(password)){
                    valido=true;
                    jugador=j;
                }
            }
        }              
        return jugador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Pokedex getThisPokedex() {
        return thisPokedex;
    }
    
    
}
