package lambdatrader;

import java.util.*;

class Solutions {

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
        source.stream();
        
    //2 What are all the unique cities where the traders work?
        System.out.println("\nUnique cities where the traders work");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //3 Find all traders from Cambridge and sort them by name.
        System.out.println("\nAll traders from Cambridge sorted by name");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //4 Return a string of all traders' names sorted alphabetically.
        System.out.println("\nReturn a string of all traders' names (sorted)");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //5 Are any traders based in Milan?
        System.out.println("\nAre any traders based in Milan?");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //6 Print the values of all transactions from the traders living in Cambridge.
        System.out.println("\nValues of all transactions from the Cambridge traders");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //7 What's the highest value of all the transactions?
        System.out.println("\nMax value of all the transactions");
        System.out.println("------------------------------------------------");
        source.stream();

        
    //8 Find the transaction with the smallest value.        
        System.out.println("\nMin value of all the transactions");
        System.out.println("------------------------------------------------");
        source.stream();

        
    }
}
