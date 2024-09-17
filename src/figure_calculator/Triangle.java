package figure_calculator;

public class Triangle extends Figure {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getSquare() {
        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2 - a)*(getPerimeter()/2-b)*(getPerimeter()/2-c));
    }
    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
