package app.optionals;

import java.util.Optional;

public class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public Optional<Car> getCar() {
        return Optional.ofNullable(car);
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
