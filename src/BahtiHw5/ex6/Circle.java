package BahtiHw5.ex6;

public class Circle implements Resizable{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public void resize(int coeficient) {
        this.r *= coeficient;
    }
}
