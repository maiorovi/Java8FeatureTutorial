package app;

import java.util.stream.IntStream;

public class MaxAndMinProducts {

    public static void main(String[] args) {
//     int arr[] = {4, -2, 5};

        int arr[] = {-4, -2, 3, 7, 5, 0, 1};
        findMaxMinProduct(arr);

    }

    static void findMaxMinProduct(int[] arr) {
        int max = 0, min = 0;
        boolean isNegativePresent = IntStream.of(arr).anyMatch( x -> x < 0);
        boolean isZeroPresent = IntStream.of(arr).anyMatch( x -> x == 0);

        int product = IntStream.of(arr)
                .mapToObj(Integer::new)
                .reduce(1, (x,y) -> x * y);

        if (isNegativePresent) {
            int pr = IntStream.of(arr)
                    .mapToObj(Integer::new)
                    .filter( x -> x != 0)
                    .reduce(1, (x,y) -> x * y);

            if (pr < 0) {
                min = pr;
                max = pr / IntStream.of(arr).min().getAsInt();
                System.out.println(max);
                System.out.println(min);
            } else if (pr > 0) {
                max = pr;
                min = pr / IntStream.of(arr).filter(x -> x < 0).max().getAsInt();
                System.out.println(max);
                System.out.println(min);
            }
        } else if (isZeroPresent) {
            min = 0;
            max = IntStream.of(arr)
                    .mapToObj(Integer::new)
                    .filter( x -> x != 0)
                    .reduce(1, (x,y) -> x * y);
            System.out.println(max);
            System.out.println(min);
        } else {
            min = IntStream.of(arr).min().getAsInt();
            max = IntStream.of(arr)
                    .mapToObj(Integer::new)
                    .filter( x -> x != 0)
                    .reduce(1, (x,y) -> x * y);
            System.out.println(max);
            System.out.println(min);
        }

    }



}
