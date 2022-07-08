package sudak;

import sudak.dload.employee.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class t91_GroupingBy {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        Map<String, List<Employee>> empsByDept =
                eList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        Map<Double, List<Employee>>empsByDeptThenSalyry =
                empsByDept.values()
                        .stream()
                        .flatMap(List::stream)
                        .collect(Collectors.groupingBy(Employee::getSalary));

        empsByDept.forEach((k, v)-> System.out.println(k+" : "+v));
        empsByDeptThenSalyry.forEach((k, v)-> System.out.println(k+" : "+v));

        Map<String, Map<Double, List<Employee>>> empsEndlose =
                eList.stream()
                        .collect(Collectors.groupingBy(Employee::getDept, Collectors.groupingBy(Employee::getSalary)));

    }
}
