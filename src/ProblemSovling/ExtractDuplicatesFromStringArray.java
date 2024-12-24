package ProblemSovling;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExtractDuplicatesFromStringArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abca", "abaa", "abbo");
//        list.stream().findFirst().get().chars().mapToObj(obj-> (char) obj).collect(Collectors.toMap(Function.identity(),Collectors.counting()));


        Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(obj -> {
            return obj.substring(0, 2);
        }));
        System.out.println(map);

        map = list.stream().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(map);

        System.out.println(IntStream.of(1,3,4,5)
//                .sum());
                .reduce((a,b)->a+b).getAsInt());
    }

}
