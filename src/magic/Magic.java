package magic;

public class Magic {
    public static void main (String[] args){
        Point p = new Point(10, 20);
        System.out.println(p);
        String s = "New object" + p;
        System.out.println(s);

        Point pNew = p;
        System.out.println(pNew);
        p.x = 30;
        System.out.println(pNew);
        pNew = p.clone();
        p.x = 50;
        System.out.println(pNew);
        System.out.println(p);
    }
}
