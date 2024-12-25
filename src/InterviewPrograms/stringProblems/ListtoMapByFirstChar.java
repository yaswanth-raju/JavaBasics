package InterviewPrograms.stringProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//extract first character of each string and count
public class ListtoMapByFirstChar {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","amruta","apparao","babai","poli");
        HashMap<String ,Integer> outmap= new HashMap<>();
         list.stream().map(e -> e.substring(0, 1)).forEach(i->{
            outmap.put(i,outmap.getOrDefault(i,0)+1);
        });
         System.out.println(outmap);
    }
}
