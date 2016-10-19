package app.constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        // there used constructor with zero parameters
        // supplier fi has following type () -> T and constructor has type () -> Pupil
        // that`s why it type checks
        Supplier<Pupil> supplier  = Pupil::new;

        // the same situation is there but constructor with one parameter is used
        Function<String, Pupil> func = Pupil::new;

        // constructor reference which requires three parameters
        BiFunction<String, Integer, Pupil> biFunction = Pupil::new;




    }
}
