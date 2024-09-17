package BahtiHw5.ex6;

public class Rectangle implements Resizable{
    private int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void resize(int coeficient) {
        this.a *= coeficient;
        this.b *= coeficient;
    }
}
