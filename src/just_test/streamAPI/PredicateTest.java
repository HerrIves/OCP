package test.streamAPI;

import oca.aufgabe01a.Person;

import java.util.function.Predicate;

public class PredicateTest {
    Predicate<Person> personPredicate = person -> person.currrentCount > 0;
}
