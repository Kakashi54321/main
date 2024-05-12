package javainterview;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ddilipk
 */
public class Test {
    public static void main(String args[]){
        Employee e1 = new Employee("Dilip", 12, "CSE");
        Employee e2 = new Employee("Dilip", 12, "CSE");
        
        //Without overriding equlas, it will be false
        System.out.println(e1.equals(e2));
        
        Set<Employee> employeesSet = new HashSet<>();
        
        employeesSet.add(e1);
        employeesSet.add(e2);
        
        //without overriding hascode there will be two entry in employeesSet
        System.out.println(employeesSet);
            
    }
}
