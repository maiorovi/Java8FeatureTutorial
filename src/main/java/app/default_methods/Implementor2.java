package app.default_methods;

public class Implementor2 implements Sized {
    @Override
    public int size() {
        return 42;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
