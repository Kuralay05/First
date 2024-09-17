package BahtiHw5.ex6;

public interface Resizable {
    void resize(int coeficient);

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,5);
        circle.resize(10);
        rectangle.resize(10);
        System.out.printf("Circle new radius: %d, Rectange new edges: %d and %d", circle.getR(), rectangle.getA(), rectangle.getB());
    }
}
