package zookeeper;

public class Mammal {
    int energyLevel = 100;

    public int displayEnergy(){
        System.out.println("King kong's Energy: " + this.energyLevel);
        return this.energyLevel;
    }
}