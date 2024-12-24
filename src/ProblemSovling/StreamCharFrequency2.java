package ProblemSovling;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCharFrequency2 {
    public static void main(String[] args) {
        String input = "AABBCDDDAAA";
        StringBuilder sb= new StringBuilder();
        input.chars().mapToObj(itm-> (char) itm).forEach(chr->{
            if(sb.length()>=2 && chr==sb.charAt(sb.length()-2)){
                sb.setCharAt(sb.length()-1, (char) (Integer.valueOf(sb.charAt(sb.length()-1))+1));
            }else{
                sb.append(chr+"1");
            }
        });
        String output =sb.toString();
        System.out.println(output); // Output: A2B2C1D3A3
    }
}
