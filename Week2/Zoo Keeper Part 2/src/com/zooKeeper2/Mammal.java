package com.zooKeeper2;

public class Mammal {
    int energyLevel = 300;

    public int displayEnergy(){
        System.out.println("The Bats current Energy: " + this.energyLevel);
        return this.energyLevel;
    }
}
