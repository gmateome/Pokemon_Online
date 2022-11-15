/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;


public class Jugador {
    
    String username;
    String password;
    Equipo equipo;
    
    Jugador(String username, String password){
        this.username=username;
        this.password=password;
        equipo=new Equipo();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    
    
    
    
    
}
