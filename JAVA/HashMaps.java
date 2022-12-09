import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> mp = new HashMap<String, Integer>();

        mp.put("India", 100);
        mp.put("USA", 25);
        mp.put("Russia", 70);

        System.out.println(mp); // op => {USA=25, India=100, Russia=70}

        mp.put("Russia", 75);
        System.out.println(mp); // op => {USA=25, India=100, Russia=75}

        if (mp.containsKey("Russia")) {
            System.out.println("Yes"); // Yes
        }

        System.out.println(mp.get("India")); // op => 100

        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.print(e.getValue() + " "); // op => USA 25 India 100 Russia 75
        }

    }
}
