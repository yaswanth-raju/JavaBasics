package java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewVarLambda {
    public static void main(String[] args) {
        List<String> arraylist = Arrays.asList("raja","rani","Ravik","");
        String str = arraylist.stream()
                .filter(Predicate.not(String::isBlank))
                .map((var x) -> x.strip())
                .collect(Collectors.joining(" | "));
        System.out.println("str:: "+str);
//                .forEach(System.out::println);
    }
}
