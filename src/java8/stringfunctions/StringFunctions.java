package java8.stringfunctions;

import java.nio.charset.StandardCharsets;

public class StringFunctions {
    public static void main(String[] args) {
        String str="abc";
        String str2="abc";
        String str3= new String("abc");
        System.out.println(str==str2);
        System.out.println(str2==str3);
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(""+str.getBytes(StandardCharsets.UTF_8)[0]);
        System.out.println(str.toCharArray()[0]);
    }
}
