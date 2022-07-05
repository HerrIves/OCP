package oca.aufgabe01a;

import java.util.ArrayList;

public class Start {

  public static void main(String[] args) {
    System.out.println(Person.count);
    
    ArrayList<Person> personList = new ArrayList<>();
    personList.add(new Person());
    
    Person person = new Person();
    personList.add(person);
    
    Person.count++;
    
    System.out.println(person.count);
  
  }

}
