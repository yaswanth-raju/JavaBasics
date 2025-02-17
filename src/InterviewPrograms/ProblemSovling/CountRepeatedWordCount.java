package InterviewPrograms.ProblemSovling;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CountRepeatedWordCount {
    public static void main(String[] args) {
        String str = "XXXXhiXXXhiXXXXhiXXX";
        String expectedChar = "hi";

        // Find all occurrences of "hi" and collect them into a list
        List<String> occurrences = findOccurrences(str, expectedChar);

        // Print the result
        occurrences.forEach(System.out::println);
    }

    public static List<String> findOccurrences(String str, String expectedChar) {
        return Pattern.compile(Pattern.quote(expectedChar))
                .matcher(str)
                .results()
                .map(matchResult -> matchResult.group())
                .collect(Collectors.toList());
    }
}
