package zookeeper;

public class Gorilla extends Mammal{

    public void throwSomething(){
        System.out.println("King Kong threw a banana!!");
        this.energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("King kong ate some bananas.");
        this.energyLevel += 10;
    }

    public void climb(){
        System.out.println("King Kong is climbing a banana tree!");
        this.energyLevel -= 10;
    }
}