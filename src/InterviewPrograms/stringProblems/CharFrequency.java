package InterviewPrograms.stringProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "AABBCDDDAAA";
        String output = getConsecutiveCharFrequency(input);
        System.out.println(output); // Output: A2B2C1D3A3
    }

    public static String getConsecutiveCharFrequency(String input) {
        List<String> result = new ArrayList<>();

        IntStream.range(0, input.length())
                .forEach(i -> {
                    if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                        result.add(input.charAt(i) + ",1");
                    } else {
                        int lastIndex = result.size() - 1;
                        String[] parts = result.get(lastIndex).split(",");
                        int count = Integer.parseInt(parts[1]) + 1;
                        result.set(lastIndex, parts[0] + "," + count);
                    }
                });

        return result.stream()
                .map(s -> s.replace(",", ""))
                .collect(Collectors.joining());
    }
}
