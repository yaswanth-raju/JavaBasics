package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        Spliterator<String> spliterator = list.spliterator();

        // TryAdvance method
        spliterator.tryAdvance(System.out::println); // Prints "A"

        // ForEachRemaining method
        spliterator.forEachRemaining(System.out::println); // Prints "B", "C", "D", "E"
    }
}
