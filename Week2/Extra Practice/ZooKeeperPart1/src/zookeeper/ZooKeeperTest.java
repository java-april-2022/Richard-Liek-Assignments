package zookeeper;
import zookeeper.Gorilla;

class ZooKeeperTest {
    public static void main(String[] args){
        Gorilla kong = new Gorilla();

        kong.throwSomething();
        kong.throwSomething();
        kong.throwSomething();
        kong.eatBananas();
        kong.eatBananas();
        kong.climb();

        kong.displayEnergy();
    }
}