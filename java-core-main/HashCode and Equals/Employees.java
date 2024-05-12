package javainterview;

import java.util.Objects;

public class Employee{
   private String name ;
   private int empId;
   private String dept;

    public Employee(String name, int empId, String dept) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.empId;
        hash = 29 * hash + Objects.hashCode(this.dept);
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
        final Employee other = (Employee) obj;
        if (this.empId != other.empId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.dept, other.dept)) {
            return false;
        }
        return true;
    }   
}
