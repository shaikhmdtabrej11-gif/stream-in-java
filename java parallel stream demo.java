
import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100
        );

        // Normal Stream
        System.out.println("=== Normal Stream ===");

        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.println(
                        Thread.currentThread().getName()
                                + " : " + n
                ));

        // Parallel Stream
        System.out.println("\n=== Parallel Stream ===");

        numbers.parallelStream()
                .map(n -> n * n)
                .forEach(n -> System.out.println(
                        Thread.currentThread().getName()
                                + " : " + n
                ));

        // Sum using Parallel Stream
        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\nSum = " + sum);

        // Filter even numbers
        System.out.println("\n=== Even Numbers ===");

        numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
