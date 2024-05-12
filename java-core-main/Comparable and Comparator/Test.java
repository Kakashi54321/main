import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Sorting Array
        int[] array = new int[] {1,3,2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Sorting Employee is not allowed
        //To make it happen, we need to implement Comparable interface for Employee class
        Employee[] empArray = new Employee[3];
        empArray[0] = new Employee("Dilip", 12, "CSE");
        empArray[1] = new Employee("Prateek", 13, "IT");
        empArray[2] = new Employee("Diwas", 10, "Aerospace");

        Arrays.sort(empArray);
        System.out.println(Arrays.toString(empArray));

        //Customized sorting on any field other than overriden compareTo method in Comparable Interface
        Arrays.sort(empArray, Employee.idComparator);
        System.out.println(Arrays.toString(empArray));

    }
}
