package InterviewPrograms.ProblemSovling;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintOnlyDuplicateChars {
    public static void main(String[] args) {
        String str = "AABBCDDEAA";
        int curCount = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                curCount++;
                sb.append(str.charAt(i));
            } else {
                curCount = 0;
            }
        }
        System.out.println(sb.toString());
    }
}
