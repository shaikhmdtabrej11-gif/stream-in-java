
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50, 20, 10, 60
        );

        // 1. Print all numbers using Stream
        System.out.println("1. All Numbers:");
        numbers.stream()
               .forEach(System.out::println);

        // 2. Filter numbers greater than 25
        System.out.println("\n2. Numbers Greater Than 25:");
        numbers.stream()
               .filter(n -> n > 25)
               .forEach(System.out::println);

        // 3. Map: Multiply each number by 2
        System.out.println("\n3. Numbers Doubled:");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        // 4. Sort numbers in ascending order
        System.out.println("\n4. Sorted Numbers:");
        numbers.stream()
               .sorted()
               .forEach(System.out::println);

        // 5. Remove duplicate numbers
        System.out.println("\n5. Distinct Numbers:");
        numbers.stream()
               .distinct()
               .forEach(System.out::println);

        // 6. Print only first 3 numbers
        System.out.println("\n6. First 3 Numbers:");
        numbers.stream()
               .limit(3)
               .forEach(System.out::println);

        // 7. Count numbers greater than 25
        long count = numbers.stream()
                            .filter(n -> n > 25)
                            .count();

        System.out.println("\n7. Count Greater Than 25: " + count);

        // 8. Find the sum using reduce()
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("\n8. Sum: " + sum);

        // 9. Collect filtered numbers into a new List
        List<Integer> result = numbers.stream()
                .filter(n -> n >= 30)
                .collect(Collectors.toList());

        System.out.println("\n9. Collected List: " + result);

        // 10. Even numbers
        System.out.println("\n10. Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .distinct()
               .forEach(System.out::println);

        // 11. Find the maximum number
        int max = numbers.stream()
                         .max(Integer::compareTo)
                         .orElse(0);

        System.out.println("\n11. Maximum Number: " + max);

        // 12. Find the minimum number
        int min = numbers.stream()
                         .min(Integer::compareTo)
                         .orElse(0);

        System.out.println("\n12. Minimum Number: " + min);
    }
}
