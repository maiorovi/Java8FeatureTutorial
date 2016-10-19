package app.stream_features;

import app.my.Person;
import app.my.PersonFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFeatures {

    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        builder
                .add("one")
                .add("two")
                .add("three")
                .add("four")
                .build()
                .forEach(System.out::println);

        PersonFactory factory = new PersonFactory();

        List<Person> personList = factory.createPersons(15);

        System.out.println(
        personList
                .stream()
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()))
        );
    }

}
