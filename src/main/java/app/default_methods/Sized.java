package app.default_methods;

public interface Sized {
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}
