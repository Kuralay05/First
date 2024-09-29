package sdp.builder;
public class MainBuilder {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}
