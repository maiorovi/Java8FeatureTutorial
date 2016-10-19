package app.building_stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class BuildingStreams {
    public static void main(String[] args) {
        //streams from value
        Stream<String> any = Stream.of("One", "Two", "Three");

        //streams from array
        Arrays.stream(new int[]{1,2,3,4,5});

        //infinite stream with iterate
        Stream.iterate(10, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        //fib numbers
        Stream.iterate(new int[]{0, 1}, tuple -> new int[]{tuple[1], tuple[0] + tuple[1]})
            .limit(20)
            .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

        //generates example

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
    }
}
