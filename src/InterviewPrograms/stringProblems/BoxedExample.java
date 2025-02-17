package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BoxedExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "banana");
        IntStream.range(0,list.size()).boxed().forEach(System.out::println);
    }
}
