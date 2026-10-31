import java.util.*;
import java.util.stream.*;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<Integer>> numbers = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> result = numbers.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

        System.out.println(result);
    }
}
