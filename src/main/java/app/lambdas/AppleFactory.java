package app.lambdas;

import java.text.NumberFormat;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AppleFactory {

    private Random rnd = new Random(System.currentTimeMillis());

    public List<Apple> createRandomApples(int amount) {
         return IntStream.range(1, amount).mapToObj( i -> createRandomApple()).collect(Collectors.toList());
    }

    public Apple createRandomApple() {
        return new Apple(rndWeight(), rndAppleColor());
    }

    private AppleColor rndAppleColor() {
        return AppleColor.values()[Math.abs(rnd.nextInt()) % (AppleColor.values().length - 1)];
    }

    private Double rndWeight() {
        return Double.valueOf(rnd.nextDouble() * 100);
    }
}
