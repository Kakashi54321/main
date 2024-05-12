package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamExample {
    public static void main(String[] args) {
		
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> nineMultipleParallel = parallelStream.filter(p -> p%9 == 0);
        //using lambda in forEach
        nineMultipleParallel.forEach(p -> System.out.println("High Nums parallel= "+p));

        Stream<Integer> nineMultipleSeq = sequentialStream.filter(p -> p%9 == 0);
        nineMultipleSeq.forEach(p -> System.out.println("High Nums sequential= "+p));
    }
}
