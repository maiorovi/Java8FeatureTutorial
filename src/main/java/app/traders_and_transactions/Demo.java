package app.traders_and_transactions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> solution = transactions.stream()
                .filter( t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(Collectors.toList());

        System.out.println(solution);

        // 2. What are all the unique cities where the traders work?
        System.out.println(
                transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList())
        );

        //3. Find all traders from Cambridge and sort them by name.
        System.out.println(
        transactions.stream()
                .map(tr -> tr.getTrader())
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(trader -> trader.getName()))
                .collect(Collectors.toList())
        );


        //4. Return a string of all traders’ names sorted alphabetically
        System.out.println(
                transactions.stream()
                .map(tr -> tr.getTrader().getName())
                .sorted((n1, n2) -> n1.compareTo(n2))
                .collect(Collectors.toList())
        );

        //5. Are any traders based in Milan?

        //anyMatchLooksBetter there
        transactions.stream()
                .filter(tr -> "Milan".equals(tr.getTrader().getCity()))
                .findAny()
                .ifPresent( tr -> System.out.println(tr.getTrader()));

        //6. Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(tr -> "Cambridge".equals(tr.getTrader().getCity()))
                .forEach(tr -> System.out.print(tr.getValue() + " "));
        //7. What’s the highest value of all the transactions?

        transactions.stream()
                .map(tr -> tr.getValue())
                .reduce(Integer::max)
                .ifPresent(val -> System.out.println("\n"+ val));

        // 8. Find the transaction with the smallest value.
        transactions.stream()
                .map(tr -> tr.getValue())
                .reduce(Integer::min)
                .ifPresent(val -> System.out.println("\n" + val));

    }
}
