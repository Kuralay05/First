import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> data = new HashMap<>();
        data.put("name", "Mike");
        data.put("city", "Astana");
        data.put("age", "18");
        System.out.println(data.get("name"));
        System.out.println(data.containsKey("city"));
        System.out.println(data.isEmpty());
        System.out.println(data.size());
        data.put("temp", "value");
        for (Map.Entry<String, String> d : data.entrySet()){
            String key = d.getKey();
            String value = d.getValue();
            System.out.println(key+ " = " + value);

        }
        data.remove("temp");
        System.out.println("______");
        data.forEach((t, u) -> System.out.println(t+ " = " +u));
        System.out.println("______");
        data.values().remove("Astana");
        data.forEach((t, u) -> System.out.println(t+ " = " +u));
        System.out.println("______");
        data.clear();
        data.forEach((t, u) -> System.out.println(t+ " = " +u));
        System.out.println(data.isEmpty());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int n = (int)(Math.random()*30);
            arr.add(n);
        }
        System.out.println(arr.get(3));
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i)+ " ");
        }
        System.out.println(arr.indexOf(6));
    }
}