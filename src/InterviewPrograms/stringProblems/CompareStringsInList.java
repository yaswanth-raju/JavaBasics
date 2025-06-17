package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareStringsInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "dates", "banana");
        list.add("dsds");
        List<String> duplicates = IntStream.range(0, list.size())
                .boxed()    //Converts the primitive int stream to a stream of Integer objects.
                .flatMap(i -> IntStream.range(i + 1, list.size())
                        .filter(j -> list.get(i).equals(list.get(j)))
                        .mapToObj(j -> list.get(i)))
                .distinct()
                .toList();

        System.out.println("Duplicate strings: " + duplicates);
    }
}
