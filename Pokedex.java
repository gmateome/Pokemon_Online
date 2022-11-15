/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.pokemon.pokemon_diamante_online;

import java.util.ArrayList;


public class Pokedex {
    
    ArrayList <Pokemon> pokemons = new ArrayList <Pokemon>();
    
    public Pokedex(){
        pokemons.add(new Pokemon(1,"Bulbasaur","Planta",100,1,2,20)); 
        pokemons.add(new Pokemon(2,"Ivysaur","Planta",125,1.5,3,45)); 
        pokemons.add(new Pokemon(3,"Venusaur","Planta",150,2)); 
        pokemons.add(new Pokemon(4,"Charmander","Fuego",100,1,5,6)); 
        pokemons.add(new Pokemon(5,"Charmaleon","Fuego",125,1.5,6,45)); 
        pokemons.add(new Pokemon(6,"Charizard","Fuego",150,2)); 
        pokemons.add(new Pokemon(7,"Squirtle","Agua",100,1,8,20)); 
        pokemons.add(new Pokemon(8,"Wartortle","Agua",125,1.5,9,45)); 
        pokemons.add(new Pokemon(9,"Blastoise","Agua",150,2)); 
        pokemons.add(new Pokemon(10,"Caterpie","Bicho",70,1,11,15)); 
        pokemons.add(new Pokemon(11,"Metapod","Bicho",70,1.5,12,25)); 
        pokemons.add(new Pokemon(12,"Butterfree","Bicho",70,2)); 
        pokemons.add(new Pokemon(13,"Weedle","Bicho",70,1,14,15)); 
        pokemons.add(new Pokemon(14,"Kakuna","Bicho",70,1.5,15,25)); 
        pokemons.add(new Pokemon(15,"Beedrill","Bicho",70,2)); 
        pokemons.add(new Pokemon(16,"Pidgey","Volador",70,1,17,20)); 
        pokemons.add(new Pokemon(17,"Pidgeotto","Volador",90,1.5,18,40)); 
        pokemons.add(new Pokemon(18,"Pidgeot","Volador",100,2)); 
        pokemons.add(new Pokemon(19,"Rattata","Normal",70,1,20,20)); 
        pokemons.add(new Pokemon(20,"Raticate","Normal",70,2)); 
        pokemons.add(new Pokemon(21,"Spearow","Volador",80,1,22,20)); 
        pokemons.add(new Pokemon(22,"Fearow","Volador",100,2)); 
        pokemons.add(new Pokemon(23,"Ekans","Veneno",80,1,24,20)); 
        pokemons.add(new Pokemon(24,"Arbok","Veneno",100,2)); 
        pokemons.add(new Pokemon(25,"Pikachu","Electrico",125,1,26,20)); 
        pokemons.add(new Pokemon(26,"Raichu","Electrico",125,2)); 
        pokemons.add(new Pokemon(27,"Sandshrew","Tierra",80,1,28,20)); 
        pokemons.add(new Pokemon(28,"Sandslash","Tierra",100,2)); 
        pokemons.add(new Pokemon(29,"NidoranF","Veneno",80,1,30,20)); 
        pokemons.add(new Pokemon(30,"Nidorina","Veneno",100,1.5,31,45)); 
        pokemons.add(new Pokemon(31,"Nidoqueen","Veneno",115,2)); 
        pokemons.add(new Pokemon(32,"NidoranM","Veneno",80,1,33,20)); 
        pokemons.add(new Pokemon(33,"Nidorino","Veneno",100,1.5,34,45)); 
        pokemons.add(new Pokemon(34,"Nidoking","Veneno",115,2)); 
        pokemons.add(new Pokemon(35,"Clefairy","Hada",80,1,36,20)); 
        pokemons.add(new Pokemon(36,"Clefable","Hada",100,2)); 
        pokemons.add(new Pokemon(37,"Vulpix","Fuego",90,1,38,20)); 
        pokemons.add(new Pokemon(38,"Ninetales","Fuego",110,2)); 
        pokemons.add(new Pokemon(39,"Jigglypuff","Hada",80,1,40,20)); 
        pokemons.add(new Pokemon(40,"Wigglytuff","Hada",100,2)); 
        pokemons.add(new Pokemon(41,"Zubat","Volador",70,1,42,20)); 
        pokemons.add(new Pokemon(42,"Golbat","Volador",100,2)); 
        pokemons.add(new Pokemon(43,"Oddish","Planta",70,1,44,20)); 
        pokemons.add(new Pokemon(44,"Gloom","Planta",90,1.5,45,40)); 
        pokemons.add(new Pokemon(45,"Vileplume","Planta",110,2)); 
        pokemons.add(new Pokemon(46,"Paras","Bicho",70,1,47,20)); 
        pokemons.add(new Pokemon(47,"Parasect","Bicho",90,2)); 
        pokemons.add(new Pokemon(48,"Venonat","Bicho",80,1,49,20)); 
        pokemons.add(new Pokemon(49,"Venomoth","Bicho",100,2)); 
        pokemons.add(new Pokemon(50,"Diglett","Tierra",80,1,51,20)); 
        pokemons.add(new Pokemon(51,"Dugtrio","Tierra",100,2)); 
        pokemons.add(new Pokemon(52,"Meowth","Normal",80,1,53,20)); 
        pokemons.add(new Pokemon(53,"Persian","Normal",100,2)); 
        pokemons.add(new Pokemon(54,"Psyduck","Agua",80,1,55,20)); 
        pokemons.add(new Pokemon(55,"Golduck","Agua",100,2)); 
        pokemons.add(new Pokemon(56,"Mankey","Lucha",80,1,57,20)); 
        pokemons.add(new Pokemon(57,"Primeape","Lucha",100,2)); 
        pokemons.add(new Pokemon(58,"Growlithe","Fuego",90,1,59,20)); 
        pokemons.add(new Pokemon(59,"Arcanine","Fuego",110,2)); 
        pokemons.add(new Pokemon(60,"Poliwag","Agua",80,1,61,20)); 
        pokemons.add(new Pokemon(61,"Poliwhirl","Agua",95,1.5,62,40)); 
        pokemons.add(new Pokemon(62,"Poliwarth","Agua",110,2)); 
        pokemons.add(new Pokemon(63,"Abra","Psiquico",80,1,64,20)); 
        pokemons.add(new Pokemon(64,"Kadabra","Psiquico",100,1.5,65,40)); 
        pokemons.add(new Pokemon(65,"Alakazam","Psiquico",120,2)); 
        pokemons.add(new Pokemon(66,"Machop","Lucha",80,1,67,20)); 
        pokemons.add(new Pokemon(67,"Machoke","Lucha",100,1.5,68,40)); 
        pokemons.add(new Pokemon(68,"Machamp","Lucha",120,2)); 
        pokemons.add(new Pokemon(69,"Bellsprout","Planta",70,1,70,20)); 
        pokemons.add(new Pokemon(70,"Weepinbell","Planta",90,1.5,71,40)); 
        pokemons.add(new Pokemon(71,"Victreebel","Planta",105,2)); 
        pokemons.add(new Pokemon(72,"Tentacool","Agua",80,1,73,20)); 
        pokemons.add(new Pokemon(73,"Tentacruel","Agua",100,2)); 
        pokemons.add(new Pokemon(74,"Geodude","Roca",70,1,75,20)); 
        pokemons.add(new Pokemon(75,"Graveler","Roca",95,1.5,76,40)); 
        pokemons.add(new Pokemon(76,"Golem","Roca",120,2)); 
        pokemons.add(new Pokemon(77,"Ponyta","Fuego",80,1,78,20)); 
        pokemons.add(new Pokemon(78,"Rapidash","Fuego",100,2)); 
        pokemons.add(new Pokemon(79,"Slowpoke","Psiquico",80,1,80,20)); 
        pokemons.add(new Pokemon(80,"Slowbro","Psiquico",100,2)); 
        pokemons.add(new Pokemon(81,"Magnemite","Electrico",80,1,82,20)); 
        pokemons.add(new Pokemon(82,"Magneton","Electrico",100,2)); 
        pokemons.add(new Pokemon(83,"Farfetch'd","Volador",90,2)); 
        pokemons.add(new Pokemon(84,"Doduo","Volador",80,1,85,20)); 
        pokemons.add(new Pokemon(85,"Dodrio","Volador",100,2)); 
        pokemons.add(new Pokemon(86,"Seel","Agua",80,1,87,20)); 
        pokemons.add(new Pokemon(87,"Dewgong","Agua",100,2)); 
        pokemons.add(new Pokemon(88,"Grimer","Veneno",80,1,89,20)); 
        pokemons.add(new Pokemon(89,"Muk","Veneno",100,2)); 
        pokemons.add(new Pokemon(90,"Shellder","Agua",80,1,91,20)); 
        pokemons.add(new Pokemon(91,"Cloyster","Agua",100,2)); 
        pokemons.add(new Pokemon(92,"Gastly","Fantasma",80,1,93,20)); 
        pokemons.add(new Pokemon(93,"Haunter","Fantasma",100,1.5,94,40)); 
        pokemons.add(new Pokemon(94,"Gengar","Fantasma",125,2)); 
        pokemons.add(new Pokemon(95,"Onix","Roca",100,2)); 
        pokemons.add(new Pokemon(96,"Drowzee","Psiquico",80,1,97,20)); 
        pokemons.add(new Pokemon(97,"Hypno","Psiquico",100,2)); 
        pokemons.add(new Pokemon(98,"Krabby","Agua",80,1,99,20)); 
        pokemons.add(new Pokemon(99,"Kingler","Agua",100,2));
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
    
    
}
