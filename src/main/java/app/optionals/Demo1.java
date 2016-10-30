package app.optionals;

import java.util.Optional;

public class Demo1 {

    public static void main(String[] args) {
        Car car = new Car(new Insurance("insurance", "123456"));
        Person person = new Person(car);


        //the modern way of checking presence in optional
        person.getCar().filter( c -> c.getInsurance().filter(insurance -> insurance.getName().equals("insurance")).isPresent()).ifPresent(x -> System.out.println("present"));

    }

    public String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person
                .filter( p -> p.getAge() >= minAge)
                .flatMap( p -> p.getCar())
                .flatMap( c -> c.getInsurance())
                .map(c -> c.getName())
                .orElse("Unknown");
    }

}
