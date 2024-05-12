import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private String name ;
    private int empId;
    private String dept;

    public Employee(String name, int empId, String dept) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    public static Comparator<Employee> idComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.empId - o2.empId;
        }
    };
}
