import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class MostRepeatedWord {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
            "java", "python", "java", "spring",
            "java", "python", "spring", "java"
        );

        String result = words.stream()
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No words");

        System.out.println("Most Repeated: " + result);
    }
}
