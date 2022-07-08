package lambdatrader;

import java.util.*;
import static java.util.Comparator.*;
import java.util.concurrent.CopyOnWriteArraySet;

import static java.util.stream.Collectors.*;

class SolveMe {

    static List<Transaction> getTransactions(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
    }

    public static void main(String[] args) {
        List<Transaction> source = getTransactions();

    //1 Find all transactions in the year 2011 and sort them by value, small to high.
        System.out.println("All transactions in 2011 sorted by value");    
        System.out.println("------------------------------------------------");
        source.stream()
//                .map(Transaction::getYear)
//                .filter(y -> y == 2011)
//                .sorted()
                .filter(x -> x.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList())
                .forEach(System.out::println);
        
    //2 What are all the unique cities where the traders work?
        System.out.println("\nUnique cities where the traders work");
        System.out.println("------------------------------------------------");
        source.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
//                .distinct()
//                .collect(toList())
//                .collect(toSet())
                .parallel()
                .collect(toCollection(CopyOnWriteArraySet::new))
                .forEach(System.out::println);

        
    //3 Find all traders from Cambridge and sort them by name.
        System.out.println("\nAll traders from Cambridge sorted by name");
        System.out.println("------------------------------------------------");
        source.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);
        
    //4 Return a string of all traders' names sorted alphabetically.
        System.out.println("\nReturn a string of all traders' names (sorted)");
        System.out.println("------------------------------------------------");
        String names =
            source.stream()
                    .map(Transaction::getTrader)
                    .map(Trader::getName)
                    .distinct()
                    .sorted()
//                    .reduce("", (n1,n2) -> n1 + " " + n2)
//                  System.out.println(names.trim());
//                    .reduce(
//                        new StringBuilder(),
//                        (StringBuilder sb, String str) -> sb.append(str).append(" "),
//                        (StringBuilder sb1,StringBuilder sb2) -> sb1.append(sb2))
//                .toString().trim();
                .collect(joining(" "));
        System.out.println(names);
        
    //5 Are any traders based in Milan?
        System.out.println("\nAre any traders based in Milan?");
        System.out.println("------------------------------------------------");
        boolean isMilanBased =
            source.stream()
                .anyMatch(x -> x.getTrader().getCity().equals("Milan"));
        System.out.println(isMilanBased);
        
    //6 Print the values of all transactions from the traders living in Cambridge.
        System.out.println("\nValues of all transactions from the Cambridge traders");
        System.out.println("------------------------------------------------");
        source.stream()
                .filter(x -> x.getTrader().getCity().equals("Milan"))
//                .map(Transaction::getValue)
                .mapToInt(Transaction::getValue)
                .forEach(System.out::println);

        
    //7 What's the highest value of all the transactions?
        System.out.println("\nMax value of all the transactions");
        System.out.println("------------------------------------------------");
//        Optional<Integer> maxValue =
//        source.stream()
//                .map(Transaction::getValue)
//                .reduce(Integer::max)
//                ;
        OptionalInt maxValue =
            source.stream()
                    .mapToInt(Transaction::getValue)
                    .max();
//        System.out.println(maxValue.getAsInt());
        System.out.println(maxValue.orElse(0));
        
    //8 Find the transaction with the smallest value.        
        System.out.println("\nMin value of all the transactions");
        System.out.println("------------------------------------------------");
        Trader nobody = new Trader("Mr.Nobody", "from Nowhere");
        Optional<Transaction> minXaction =
            source.stream()
//                    .min(comparing(Transaction::getValue))
                .reduce((x1,x2) -> x1.getValue() < x2.getValue() ? x1 : x2 );
        System.out.println(minXaction.orElse(new Transaction(nobody,0,0)));
        
    }
}
