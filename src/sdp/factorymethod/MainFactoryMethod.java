package sdp.factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        TransportFactory factory = new ShipFactory();
        factory.planDelivery();
    }
}
