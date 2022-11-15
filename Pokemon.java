
package my.pokemon.pokemon_diamante_online;


public class Pokemon {
        
    int id;
    String name;
    String type;
    int power;
    double evo;
    int nextEvo;
    int nextEvoLV;
    double lv;
    
    Pokemon(){}
    
    Pokemon(int id,String name,String type, int power, double evo, int nextEvo, int nextEvoLV){
    this.id=id;
    this.name=name;
    this.type=type;
    this.power=power;
    this.evo=evo;
    this.nextEvo=nextEvo;
    this.nextEvoLV=nextEvoLV; 
    lv=1;
    }
    
    Pokemon(int id,String name,String type, int power, double evo){
    this.id=id;
    this.name=name;
    this.type=type;
    this.power=power;
    this.evo=evo;
    nextEvo=0;
    nextEvoLV=0;
    lv=1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public double getEvo() {
        return evo;
    }

    public int getNextEvo() {
        return nextEvo;
    }

    public int getNextEvoLV() {
        return nextEvoLV;
    }

    public double getLv() {
        return lv;
    }

    public void setLv(double lv) {
        this.lv = lv;
    }
    
    
    
    
}
