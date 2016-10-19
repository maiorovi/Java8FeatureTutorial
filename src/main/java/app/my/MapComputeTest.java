package app.my;

import java.util.HashMap;

public class MapComputeTest {
    public static void main(String[] args) {
        HashMap<String, Integer> container = new HashMap<>();
        container.put("A", 1);
        container.put("B", 2);
        container.put("C", 3);

        System.out.println(container);

        container.compute("A", (key,value) -> value == null ? 42 : 42 + value);
        System.out.println(container);
        container.compute("X", (key,value) -> value == null ? 42 : 42 + value);

        System.out.println(container);

        container.computeIfAbsent("E", key -> 5);
        container.computeIfAbsent("A", key -> 53);

        System.out.println(container);

        container.computeIfPresent("C", (key, value) -> value + 100);
        container.computeIfPresent("F", (key, value) -> value + 200);

        System.out.println(container);

        //merge method is working in the following way
        // 1) if the key is present in the map then provided bifunction is used to do a merge
        // 2) if the key is absent then it is just put with corresponding value
    }
}
