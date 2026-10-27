
import java.util.stream.IntStream;

public class ParallelSum {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 100)
                .parallel()
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println("Sum of even numbers: " + sum);
    }
}
