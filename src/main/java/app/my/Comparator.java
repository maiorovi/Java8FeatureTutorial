package app.my;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T>{

    int compare(T fst, T snd);

    static <U, K extends Comparable<? super K>> Comparator<U> comparing(Function<U, K> keyExtractor) {
        return (U p1, U p2) -> keyExtractor.apply(p1).compareTo(keyExtractor.apply(p2));
    }

    static <T extends Comparable<T>> int countGreaterThen(T[] array, T elem) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (elem.compareTo(array[i]) > 0) {
                count++;
            }
        }

        return count;
    }
}
