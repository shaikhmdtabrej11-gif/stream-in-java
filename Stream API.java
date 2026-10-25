import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> marks =
            Arrays.asList(40, 75, 30, 90, 60);

        marks.stream()
             .filter(m -> m > 50)
             .forEach(System.out::println);
    }
}
