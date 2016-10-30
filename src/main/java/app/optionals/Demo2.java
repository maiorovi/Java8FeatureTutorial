package app.optionals;

import java.util.Optional;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");


        System.out.println(readDuriation(props, "a"));
        System.out.println(readDuriation(props, "b"));
        System.out.println(readDuriation(props, "c"));
        System.out.println(readDuriation(props, "d"));

    }

    public static int readDuriation(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name)).flatMap(Demo2::stringToInt).filter(i -> i > 0).orElse(0);
    }

    public static Optional<Integer> stringToInt(String number) {

        try {
            Integer i = Integer.parseInt(number);
            return Optional.of(i);
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }

    }

}
