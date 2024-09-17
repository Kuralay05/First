package figure_calculator;

public class Rectangle extends Figure {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    double getSquare() {
        return a*b;
    }

    @Override
    double getPerimeter() {
        return a+b;
    }
}
