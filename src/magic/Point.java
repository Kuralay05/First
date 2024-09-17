package magic;

public class Point implements Cloneable{
    public int x;
    public int y;
    private int id = 1;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Точка с координатами (" + x + ", " + y + ")";
    }
    public Point clone(){
        Point p = new Point(x,y);
        p.id = 2;
        return p;
    }
}
