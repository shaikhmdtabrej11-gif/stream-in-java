
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        // Normal Stream
        System.out.println("Normal Stream:");
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);

        // Parallel Stream
        System.out.println("Parallel Stream:");
        numbers.parallelStream()
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
