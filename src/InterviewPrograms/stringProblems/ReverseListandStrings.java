package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseListandStrings {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","def","cfg");
        IntStream
                .iterate(list.size()-1,i->i-1)
                .limit(list.size())
                .mapToObj(index->new StringBuilder(list.get(index)).reverse().toString())
                .forEach(System.out::println);
    }
}
