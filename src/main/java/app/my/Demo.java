package app.my;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        PersonFactory factory = new PersonFactory();

        List<Person> persons = factory.createPersons(15);

        persons.forEach( p -> System.out.println(p));
        persons.removeIf(person -> person.getAge() > 10);
        System.out.println();
        System.out.println();
        persons.forEach( p -> System.out.println(p));
        System.out.println();
        System.out.println();

        //replaceAll which takes UnaryOperator
        //sort method


    }

    public static <T> String mkString(List<? super T> lists, String delimiter) {
        String result = "";

        return null;
    }
}
