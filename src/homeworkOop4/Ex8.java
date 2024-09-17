package homeworkOop4;

public class Ex8 {
    public static void arip(String figure, int side){
        switch (figure){
            case "triangle":
                double S = Math.sqrt(3)/4*Math.pow(side, 2);
                System.out.println(S);
                break;
            case "square":
                double t = side*side;
                System.out.println(t);
                break;
            case "circle":
                double k =  Math.PI* Math.pow(side, 2);
                System.out.println(k);
                break;
        }
    }

    public static void main(String[] args) {
        arip("square", 4);
    }
}
