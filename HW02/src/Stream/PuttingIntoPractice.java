package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        task1(transactions);
        task2(transactions);
        task3(transactions);
        task4(transactions);
        task5(transactions);
        task6(transactions);
        task7(transactions);
        task8(transactions);

    }

    public static void task1(List<Transaction> transactions) {
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void task2(List<Transaction> transactions) {
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }

    public static void task3(List<Transaction> transactions) {
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }

    public static void task4(List<Transaction> transactions) {
        String str = transactions.stream()
                .map(transaction -> transaction.getTrader().getName() + ", ")
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(str);
        System.out.println();
    }

    public static void task5(List<Transaction> transactions) {
        System.out.println(transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));
        System.out.println();
    }

    public static void task6(List<Transaction> transactions) {
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void task7(List<Transaction> transactions) {
        int maxValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparingInt(x -> x)).get();
        System.out.println(maxValue);
        System.out.println();
    }

    public static void task8(List<Transaction> transactions) {
        int minValue = transactions.stream()
                .map(Transaction::getValue)
                .max((x1, x2) -> x2-x1).get();
        System.out.println(minValue);
    }
}