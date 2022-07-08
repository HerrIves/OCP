package afternoon;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

class Dog{
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    String getName() {return name;}
    int getAge() {return age;}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

class distinctByKeyTest {
	
    // this is a stateful predicate
    static <T> Predicate<T> distinctByKey(Function<? super T, String> keyExtractor ){
    
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return new Predicate<T>() {
            @Override
            public boolean test(T dog) {
                return seen.putIfAbsent(keyExtractor.apply(dog), Boolean.TRUE) == null;
            }
        };
    }
    
    
    public static void main(String[] args) {
        
        Dog white = new Dog("White", 2);
        Dog fluffy1 = new Dog("Fluffy", 4);
        Dog spot = new Dog("Spot", 19);
        Dog fluffy2 = new Dog("Fluffy", 1);
        
        List<Dog> list = new ArrayList<>();
        list.add(white);
        list.add(fluffy1);
        list.add(spot);
        list.add(fluffy2);
        
        list.stream()
            .filter(distinctByKey(
                    (dog) -> dog.getName()
            ))    // or Dog::getAge
//            .distinct(      )
            .forEach(System.out::println);
        
        
    }
}
