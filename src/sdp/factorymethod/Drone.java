package sdp.factorymethod;

public class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by air using a drone.");
    }
}

