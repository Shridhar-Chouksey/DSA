package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Shridhar","Chouksey",32));
        employeeList.add(new Employee("Shriji","Singh",64));
        employeeList.add(new Employee("Suresh","Chouksey",102));
        employeeList.add(new Employee("Rony","Sharma",46));

//           employeeList.forEach(System.out::println);
//           System.out.println(employeeList.get(1));
//
//          System.out.println(employeeList.isEmpty());
//
        employeeList.set(1,new Employee("shrizee","chouksey",45));
       // employeeList.forEach(System.out::println);

        Employee[] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee:employeeArray){
            System.out.println(employee);

        }
        System.out.println(employeeList.contains(new Employee("Shridhar","Chouksey",32)));
    }
}
