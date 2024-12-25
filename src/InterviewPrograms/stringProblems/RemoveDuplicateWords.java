package InterviewPrograms.stringProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("instr ="+str);

        List<String> list= Arrays.asList(str.split(" "));
//        String out = list.stream().filter(entry->!entry.toLowerCase().equals(removeWord)).collect(Collectors.joining(" "));
        String out = list.stream().map(str1->str1.toLowerCase())
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().peek(stringLongEntry -> {
                    if(stringLongEntry.getValue()>=2){
                        System.out.println("Remove word="+stringLongEntry.getKey());
                    }
                }).filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey())
                .collect(Collectors.joining(" "));
        System.out.println("outstr ="+out);
    }
}
//Output: quick brown fox jumps over lazy dog