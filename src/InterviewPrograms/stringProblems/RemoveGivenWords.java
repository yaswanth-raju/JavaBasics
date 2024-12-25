package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveGivenWords {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("in str ="+str);
        String removeWord="the";
        List<String> list= Arrays.asList(str.split(" "));
        System.out.println("Removing word="+removeWord);
        String out = list.stream().filter(entry->!entry.toLowerCase().equals(removeWord)).collect(Collectors.joining(" "));
        System.out.println("outstr ="+out);
    }
}
//Output: quick brown fox jumps over lazy dog