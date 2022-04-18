package com.zooKeeper2;

public class ZooKeeperTest {

	public static void main(String[] args){
        
		Bat batty = new Bat();

        batty.attackTowns();
        batty.attackTowns();
        batty.attackTowns();
        batty.eatHumans();
        batty.eatHumans();
        batty.fly();
        batty.fly();

        batty.displayEnergy();
    }
}
