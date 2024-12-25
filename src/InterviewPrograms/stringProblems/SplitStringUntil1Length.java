package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SplitStringUntil1Length {
    //Reduce string into multiple strings until last string length should became 1
    //Ex: RajaKumar -->Even length
    //Ex: RajakKumar-->Odd length
    // Steps: RajaKumar = Raja--K--umar
    //                     / \   / \
    //                  Ra   ja um ar
    //                  /\   /\  /\ /\
    //                  R a  j a u m a r
    // Final string should as above Rajaumar
    public static void main(String[] args) {
        List<String> list= Arrays.asList("str1","str2");
        Optional<String> result = list.stream().reduce(String::concat);
        System.out.println(list.stream().collect(Collectors.joining()));
        System.out.println(result.get());
    }
}
