package app.my;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonFactory {
    private BiFunction<String,Integer,Person> personConstructor = Person::new;
    private Random rnd = new Random();
    private List<String> names = new ArrayList<>();

    public PersonFactory() {
        initNamesCollection();
    }

    private void initNamesCollection() {
        names.add("Andrew");
        names.add("Bill");
        names.add("Andy");
        names.add("Martin");
        names.add("Dmytro");
    }

    public List<Person> createPersons(int amount) {
        return IntStream.range(0, amount).mapToObj( n -> createPerson()).collect(Collectors.toList());
    }

    public Person createPerson() {
        int nameIndex = rnd.nextInt(names.size()-1);
        int age = rnd.nextInt(30);

        return new Person(names.get(nameIndex), age);
    }

    public Map<City, List<Person>> createCityWiseList() {
        Map<City, List<Person>> container = new HashMap<>();


        Arrays.asList("Kiev","Dnepr","Lviv").stream().forEach( city -> container.put(new City(city), createPersons(15)));



        return container;
    }
}
