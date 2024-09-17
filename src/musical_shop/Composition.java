package musical_shop;

public class Composition {
    String name1;
    double duration;
    Medium medium;

    public Composition(String name1, double duration) {
        this.name1 = name1;
        this.duration = duration;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Medium getMedium() {
        return medium;
    }

}
