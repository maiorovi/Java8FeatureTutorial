package app.optionals;

public class Demo {

    public static void main(String[] args) {
        Insurance insurance = new Insurance("SimpleInsurance", "1234XYZ");
        Car car = new Car();

        Person person = new Person(car);
        car.setInsurance(insurance);

        System.out.println(
                person.getCar()
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElseGet( () -> "Go Away")
        );


    }

}
