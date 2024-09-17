package BahtiHw5.ex5;

public class Rectangle extends Shape{
    private int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle.calculateArea());
    }
}
