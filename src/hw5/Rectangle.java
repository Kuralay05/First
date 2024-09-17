package hw5;

class Rectangle extends Shape implements Resizable{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
    public void resize(double factor) {
        this.length *= factor;
        this.width *= factor;
    }
}
