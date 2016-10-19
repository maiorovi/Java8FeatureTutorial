package app.my;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> and(Predicate<T> p1) {
        return (T t) -> p1.test(t) && test(t);
    }

    default Predicate<T> or(Predicate<T> p2) {
        return (T t) -> p2.test(t) || test(t);
    }

    static <T> Predicate<T> isEqualsTo(T t1) {
        return t -> t.equals(t1);
    }
}
