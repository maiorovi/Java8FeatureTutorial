package app.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionDemo {

    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        int sum = list.stream().reduce(0, (a,b) -> a + b);

        System.out.println(sum);

        Optional<Integer> product = list.stream().reduce((a, b) -> a * b);

        System.out.println(product.get());
    }

}
