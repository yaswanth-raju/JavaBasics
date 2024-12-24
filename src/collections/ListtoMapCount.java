package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMapCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","amruta","apparao","babai","poli");
        HashMap<String ,Integer> outmap= new HashMap<>();
        outmap.get("dd");
         list.stream().map(e -> e.substring(0, 1)).forEach(i->{
            outmap.put(i,outmap.getOrDefault(i,0)+1);
        });
         System.out.println(outmap);
    }
}
