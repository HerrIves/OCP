package just_test.streamAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    static Predicate<oca.aufgabe01a.Person> personPredicate = person -> person.currrentCount > 0;

    public static void main(String[] args) {
        personPredicate
                .and(person -> person.currrentCount > 1)
                .or(person -> person.currrentCount > 2)
                .negate()
                .and(Predicate.isEqual(null));

        List<oca.aufgabe08c.db.tables.Book> books = new ArrayList<>();
// fill the books list with books here...
        BiPredicate<String, Double> javaBuy = (name, price) -> name.contains("Java");
        BiPredicate<String, Double> priceBuy = (name, price) -> price < 55.00;
        BiPredicate<String, Double> definitelyBuy = javaBuy.and(priceBuy);
        books.forEach(book -> {
            if (definitelyBuy.test(book.getTitle(), book.getPrice())) {
                System.out.println("You should definitely buy " + book.getPrice()
                        + "(" + book.getPrice() + ")");
            }
        });
    }
}
