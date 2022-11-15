/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

/**
 *
 * @author gmateome
 */
public class Tipos {
    
    public Tipos(){}
    
    public double getMultiplicador(Pokemon pokemon1,Pokemon pokemon2){
        double multiplicador=1;
        switch(pokemon1.getType()){
            case "Planta":
                switch(pokemon2.getType()){
                    case "Agua":
                        multiplicador=2;
                    break;
                    case "Psiquico":
                        multiplicador=2;
                    break;
                    case "Bicho":
                        multiplicador=0.5;
                    break;
                    case "Fuego":
                        multiplicador=0.5;
                    break;
                    case "Planta":
                        multiplicador=0.5;
                    break;
                    case "Veneno":
                        multiplicador=0.5;
                    break;
                    case "Volador":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Fuego":
                switch(pokemon2.getType()){
                    case "Bicho":
                        multiplicador=2;
                    break;
                    case "Planta":
                        multiplicador=2;
                    break;
                    case "Agua":
                        multiplicador=0.5;
                    break;
                    case "Fuego":
                        multiplicador=0.5;
                    break;
                    case "Roca":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Agua":
                switch(pokemon2.getType()){
                    case "Fuego":
                        multiplicador=2;
                    break;
                    case "Roca":
                        multiplicador=2;
                    break;
                    case "Tierra":
                        multiplicador=2;
                    break;
                    case "Agua":
                        multiplicador=0.5;
                    break;
                    case "Planta":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Bicho":
                switch(pokemon2.getType()){
                    case "Planta":
                        multiplicador=2;
                    break;
                    case "Psiquico":
                        multiplicador=2;
                    break;
                    case "Fantasma":
                        multiplicador=0.5;
                    break;
                    case "Fuego":
                        multiplicador=0.5;
                    break;
                    case "Hada":
                        multiplicador=0.5;
                    break;
                    case "Lucha":
                        multiplicador=0.5;
                    break;
                    case "Volador":
                        multiplicador=0.5;
                    break;
                    case "Veneno":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Volador":
                switch(pokemon2.getType()){
                    case "Bicho":
                        multiplicador=2;
                    break;
                    case "Lucha":
                        multiplicador=2;
                    break;
                    case "Planta":
                        multiplicador=2;
                    break;
                    case "Electrico":
                        multiplicador=0.5;
                    break;
                    case "Roca":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Normal":
                switch(pokemon2.getType()){
                    case "Roca":
                        multiplicador=0.5;
                    break;
                    case "Fantasma":
                        multiplicador=0;
                    break;
                }
            break;
            case "Veneno":
                switch(pokemon2.getType()){
                    case "Hada":
                        multiplicador=2;
                    break;
                    case "Planta":
                        multiplicador=2;
                    break;
                    case "Fantasma":
                        multiplicador=0.5;
                    break;
                    case "Roca":
                        multiplicador=0.5;
                    break;
                    case "Tierra":
                        multiplicador=0.5;
                    break;
                    case "Veneno":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Electrico":
                switch(pokemon2.getType()){
                    case "Agua":
                        multiplicador=2;
                    break;
                    case "Volador":
                        multiplicador=2;
                    break;
                    case "Electrico":
                        multiplicador=0.5;
                    break;
                    case "Planta":
                        multiplicador=0.5;
                    break;
                    case "Tierra":
                        multiplicador=0;
                    break;
                }
            break;
            case "Tierra":
                switch(pokemon2.getType()){
                    case "Electrico":
                        multiplicador=2;
                    break;
                    case "Fuego":
                        multiplicador=2;
                    break;
                    case "Roca":
                        multiplicador=2;
                    break;
                    case "Veneno":
                        multiplicador=2;
                    break;
                    case "Bicho":
                        multiplicador=0.5;
                    break;
                    case "Planta":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Hada":
                switch(pokemon2.getType()){
                    case "Lucha":
                        multiplicador=2;
                    break;
                    case "Fuego":
                        multiplicador=0.5;
                    break;
                    case "Veneno":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Lucha":
                switch(pokemon2.getType()){
                    case " Normal":
                        multiplicador=2;
                    break;
                    case "Roca":
                        multiplicador=2;
                    break;
                    case "Bicho":
                        multiplicador=0.5;
                    break;
                    case "Hada":
                        multiplicador=0.5;
                    break;
                    case "Psiquico":
                        multiplicador=0.5;
                    break;
                    case "Veneno":
                        multiplicador=0.5;
                    break;
                    case "Volador":
                        multiplicador=0.5;
                    break;
                    case "Fantasma":
                        multiplicador=0;
                    break;
                }
            break;
            case "Psiquico":
                switch(pokemon2.getType()){
                    case "Lucha":
                        multiplicador=2;
                    break;
                    case "Veneno":
                        multiplicador=2;
                    break;
                    case "Psiquico":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Roca":
                switch(pokemon2.getType()){
                    case "Bicho":
                        multiplicador=2;
                    break;
                    case "Fuego":
                        multiplicador=2;
                    break;
                    case "Volador":
                        multiplicador=2;
                    break;
                    case "Lucha":
                        multiplicador=0.5;
                    break;
                    case "Tierra":
                        multiplicador=0.5;
                    break;
                }
            break;
            case "Fantasma":
                switch(pokemon2.getType()){
                    case "Fantasma":
                        multiplicador=2;
                    break;
                    case "Psiquico":
                        multiplicador=2;
                    break;
                    case "Normal":
                        multiplicador=0;
                    break;
                }
            break;           
        }       
        return multiplicador;
    }
    
}
