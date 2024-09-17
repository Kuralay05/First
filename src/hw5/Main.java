package hw5;

public class Main {
    public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(4.9, 2.7);
            System.out.println("Original Area of Circle: " + Math.round(circle.calculateArea()));
            System.out.println("Original Area of Rectangle: " + Math.round(rectangle.calculateArea()));

            circle.resize(6.0);
            rectangle.resize(1.5);

            // Displaying the areas after resizing
            System.out.println("Area of Circle after resizing: " + Math.round(circle.calculateArea()));
            System.out.println("Area of Rectangle after resizing: " + Math.round(rectangle.calculateArea()));
        }
}
