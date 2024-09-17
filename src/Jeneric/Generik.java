package Jeneric;

public class Generik {
    public static void main(String[] args){
        Test t = new Test<Integer, String >(10, "Hello");
        t.setData1(15);
        t.setData2("World");
        System.out.println(t.getData1());
        System.out.println(t.getData2());
    }
}
