package sudak.dload.afternoon;

import sudak.dload.employee.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class AvoidStatefulness {

    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();

//        List<Employee> newList01 = Collections.synchronizedList(new ArrayList<>());
        List<Employee> newList01 = new ArrayList<>();
        eList.parallelStream()
            .filter(e -> e.getDept().equals("Eng"))
            .forEach(e -> newList01.add(e)); 
        
        List<Employee> newList02 =
            eList.parallelStream()
                .filter(e -> e.getDept().equals("Eng"))
                .collect(Collectors.toList()); 


        System.out.println(newList01);
        System.out.println("****************************");
        System.out.println(newList02);
        
        
    }
}
