package java11;

import java.util.List;
import java.util.stream.Collectors;

public class NewStringFunctions {
    public static void main(String[] args) {
        String multilineString = " ";
        System.out.println("\nmultilineString1 empty space isBlank()="+multilineString.isBlank()+" isEmpty()="+multilineString.isEmpty());
        multilineString = " abcdef    ";
        System.out.println("strip function="+multilineString.strip()+"=");
        System.out.println("stripLeading function="+multilineString.stripLeading()+"=");
        System.out.println("stripTrailing function="+multilineString.stripTrailing()+"=");
        multilineString = "Baeldung helps \n \n developers \n explore Java.";

        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
//        assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
    }
}
