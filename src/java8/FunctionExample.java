package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    static Function<String, String> toFirstCharUpper1 = (e) -> {
        StringBuilder sb = new StringBuilder(e);
        sb.setCharAt(0, Character.toUpperCase(e.charAt(0)));
        return sb.toString();
    };

    static Function<String, String> toFirstCharUpper2 = (e) -> {
        char[] chrArr = e.toCharArray();
        chrArr[0]=Character.toUpperCase(chrArr[0]);
        return String.valueOf(chrArr);
    };
    static String toFirstCharUpper2(String str){
        char[] chrArr = str.toCharArray();
        chrArr[0]=Character.toUpperCase(chrArr[0]);
        return String.valueOf(chrArr);
    }
    static Function<String, String> eachFirstCharUpper = (e) -> {
        return Arrays.stream(e.split(" "))
                .map(toFirstCharUpper2)
                .collect(Collectors.joining(" "));
    };


    public static void main(String[] args) {
        String str = "my name is billa";
        String upperStr = eachFirstCharUpper.apply(str);
        System.out.println("upper Str: " + upperStr);
    }
}
