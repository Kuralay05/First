package hw5;

 class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
     @Override
     double calculateArea() {
         return Math.PI * radius * radius;
     }

     public void resize(double factor) {
         this.radius *= factor;
     }
}