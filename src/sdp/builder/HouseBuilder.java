package sdp.builder;

public class HouseBuilder {
    int numRooms;
    int numFloors;
    boolean hasPool;
    boolean hasGarage;

    public HouseBuilder setNumRooms(int numRooms) {
        this.numRooms = numRooms;
        return this;
    }

    public HouseBuilder setNumFloors(int numFloors) {
        this.numFloors = numFloors;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public House build() {
        return new House(this);
    }
}

