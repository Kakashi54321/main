package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Java8ForEachExample {
    public static void main(String[] args) {	
        
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<=5; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
                System.out.println("Iterator Value::"+it.next());
        }

        // traversing using forEach
        myList.forEach(i -> System.out.println("List Value::" +i));
    }
}