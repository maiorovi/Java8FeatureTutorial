package app.lambdas;

import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        AppleFactory factory = new AppleFactory();

        List<Apple> apples  = factory.createRandomApples(10);

        apples.forEach(System.out::println);

        apples.sort(Comparator.comparing(Apple::getWeight));

        System.out.println();
        System.out.println();


        apples.forEach(a -> System.out.println(a));
    }

}
