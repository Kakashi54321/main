package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface {
    public int addMethod(int a, int b);
}

public class Java8FunctionalInterfaceExample {
   public static void main(String args[]) {
        List<String> names1 = new ArrayList<>();
        names1.add("Dilip ");
        names1.add("Diwas ");
        names1.add("Abhir ");
        names1.add("Rahul ");
        names1.add("Kabir ");

        List<String> names2 = new ArrayList<>();
        names2.add("Dilip ");
        names2.add("Diwas ");
        names2.add("Abhir ");
        names2.add("Rahul ");
        names2.add("kabir ");
        
        List<String> names3 = new ArrayList<>();
        names3.add("Dilip ");
        names3.add("Diwas ");
        names3.add("Abhir ");
        names3.add("Rahul ");
        names3.add("kabir ");

        //sorting using java7
        Collections.sort(names1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               return s1.compareTo(s2);
            }
        });
        System.out.println(names1);
        
        //sorting using java 8 using member reference
        Collections.sort(names2, String::compareTo);
        System.out.println(names1);
        
        //sorting using java 8 using Lambda Expression
        Collections.sort(names3, (s1, s2) -> s1.compareTo(s2));
        System.out.println(names3);

        // Using Labda Expression via own functional interface
    	MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: " +sum.addMethod(12, 188));
    }
}