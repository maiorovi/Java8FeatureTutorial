package app.my;

import java.util.HashMap;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

        factory.createCityWiseList().forEach(
                (city, persons) -> System.out.println(city.toString() + ":  " + persons.size() + "people")
        );

        //getOrDefault
        HashMap<String, Integer> map = new HashMap<>();
        map.put("fst", 1);
        map.put("snd", 2);

        // returns value if key present in a map
        System.out.println(map.get("fst"));

        //retursn default value if key does not present in map
        System.out.println(map.getOrDefault("third", 3));

        //putIfAbsent
    }

}
