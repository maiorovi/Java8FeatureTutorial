package app;

import java.util.stream.IntStream;

public class MaxAndMinProducts {

    public static void main(String[] args) {
//     int arr[] = {4, -2, 5};

//        int arr[] = {-4, -2, 3, 7, 5, 0, 1};
//        int arr[] = {4, -71, -7, -16, 54, 56, -60, 66, 76, 31};
        int arr[]= {96, -79, 48, 99, -32, -16};
        findMaxMinProduct(arr);

    }

    static void findMaxMinProduct(int[] arr) {
        long max = 0, min = 0;
        boolean isNegativePresent = IntStream.of(arr).anyMatch( x -> x < 0);
        boolean isZeroPresent = IntStream.of(arr).anyMatch( x -> x == 0);


        if (isNegativePresent) {
            long pr = IntStream.of(arr)
                    .mapToObj(Long::new)
                    .filter( x -> x != 0)
                    .reduce(1l,(x,y) -> x * y);

            if (pr < 0) {
                min = pr;
                max = pr / IntStream.of(arr).mapToLong(x -> (long)x).filter(x -> x < 0).max().getAsLong();
                System.out.print(max + " ");
                System.out.println(min);
            } else if (pr > 0) {
                max = pr;
                min = pr / IntStream.of(arr).mapToLong(x -> (long)x).filter(x -> x < 0).max().getAsLong();
                System.out.print(max + " ");
                System.out.println(min);
            }
        } else if (isZeroPresent) {
            min = 0;
            max = IntStream.of(arr)
                    .mapToObj(Long::new)
                    .filter( x -> x != 0)
                    .reduce(1l, (x,y) -> x * y);
            System.out.print(max + " ");
            System.out.println(min);
        } else {
            min = IntStream.of(arr).mapToLong(x -> (long)x).min().getAsLong();
            max = IntStream.of(arr)
                    .mapToObj(Long::new)
                    .filter( x -> x != 0)
                    .reduce(1l, (x,y) -> x * y);
            System.out.print(max + " ");
            System.out.println(min);
        }
    }
}
