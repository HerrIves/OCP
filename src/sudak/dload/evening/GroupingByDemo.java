package sudak.dload.evening;

import sudak.dload.employee.Employee;

import java.util.*;
import static java.util.stream.Collectors.*;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        
//---- step-by-step solution        
        Map<String, List<Employee>> empsByDept =
           eList.stream()
                .collect(groupingBy(Employee::getDept));

        Map<Double, List<Employee>> empsByDeptThenSalaryTrad =
           empsByDept.values()
                     .stream()
                     .flatMap(dept -> dept.stream())
                     .collect(groupingBy(Employee::getSalary));
        
        System.out.println(empsByDeptThenSalaryTrad);

//---- fluid API solution        
        
        System.out.println("******************************************");
        
        Map<String, Map<Double,List<Employee>>> empsByDeptThenSalaryFluid =
            eList.stream()
                 .collect(groupingBy(Employee::getDept,
                         groupingBy(Employee::getSalary)));
        
        empsByDeptThenSalaryFluid.entrySet().forEach(System.out::println);
    }
}
