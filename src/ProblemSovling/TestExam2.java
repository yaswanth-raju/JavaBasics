import com.sun.jdi.ArrayReference;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestExam2 {
    public static void main(String[] args) {
        String str="Yaswanthraju";
        Map<Character, Long> countedMap = str.chars().mapToObj(obj -> (char) obj).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countedMap);

        Map<String, Integer> eachStrLength = str.chars().mapToObj(obj -> String.valueOf(obj)).collect(Collectors.toMap(String::toString, String::length,(a,b)->a));
        System.out.println(eachStrLength);  //Prints each character length

//        HashMap<Character, Long> map = str.chars().mapToObj(obj -> (char) obj).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
//        Long list = map.entrySet().stream().filter(entry -> entry.getValue() > 1).peek(System.out::println).collect(Collectors.counting());

    }
}
