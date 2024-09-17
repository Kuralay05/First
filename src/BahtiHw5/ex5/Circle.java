package BahtiHw5.ex5;

public class Circle extends Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return r * r * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
    }
}
