package InterviewPrograms.stringProblems;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExtractPair {
    public static void main(String[] args) {
        String str = "a 1 b 3 c 4 d 5";

        // Split the string into a stream using Pattern.splitAsStream
        List<String> list = Pattern.compile(" ").splitAsStream(str)
                .collect(Collectors.toList());

        // Use streams to pair characters and numbers
        Map<String, Integer> pairs = IntStream.range(0, list.size() / 2)
                .boxed()
                .collect(Collectors.toMap(
                        i -> list.get(i * 2),
                        i -> Integer.parseInt(list.get(i * 2 + 1))
                ));

        // Print the result
        pairs.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
