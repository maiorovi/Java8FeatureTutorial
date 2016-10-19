package app.my;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {

    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();

        List<Person> persons = factory.createPersons(15);

        System.out.println(persons.stream().map(Person::getName).collect(Collectors.toList()));

        //experiments with split
        String[] res = "hello".split("");
        Arrays.stream(res).forEach(System.out::println);

        List<String> distinctCharacters = Arrays.asList("Hello","World")
                                                .stream()
                                                .map(s -> s.split(""))
                                                .flatMap(Arrays::stream)
                                                .distinct()
                                                .collect(Collectors.toList());

        System.out.println(distinctCharacters);

        List<Integer> squares = Arrays.asList(1, 2, 3, 4, 5)
                                      .stream()
                                      .map(x -> x * x)
                                      .collect(Collectors.toList());

        System.out.println(squares);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        List<int[]> list =      numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j}).filter(arr -> (arr[0] + arr[1]) % 3 == 0)
                )
                .collect(Collectors.toList());


        list.forEach( arr -> System.out.print(Arrays.toString(arr) + " "));

    }
}
