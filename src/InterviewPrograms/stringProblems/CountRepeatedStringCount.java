package InterviewPrograms.stringProblems;

import collections_util.ArrayListUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRepeatedStringCount {
    public static void main(String[] args) {
        List<String > list =ArrayListUtil.getListOfRandomStrings();
        Map<String, List<String>> out = list.stream().collect(Collectors.groupingBy(item -> {
            char[] arr = item.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }));

        System.out.println("List of same character items"+out);
        Map<String, Long> count = list.stream().collect(Collectors.groupingBy(item -> {
            char[] arr = item.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        },Collectors.counting()));
        System.out.println("List of same character items count "+count);
    }
}
