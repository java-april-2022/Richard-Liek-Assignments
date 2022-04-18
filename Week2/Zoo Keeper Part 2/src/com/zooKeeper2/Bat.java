package com.zooKeeper2;

public class Bat extends Mammal {

    public void fly(){
        System.out.println("The bat took off... flip flap!");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("uhh a bat somehow ate a human?");
        this.energyLevel += 25;
    }

    public void attackTowns(){
        System.out.println("Um is batman in town? why are bats attacking the town?!");
        this.energyLevel -= 100;
    }
}
