package figure_calculator;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getSquare() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

