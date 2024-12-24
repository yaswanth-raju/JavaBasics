package java8.streams;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().reduce(100,(a,b)->a+b));

        Reduce reduce = new Reduce();
        reduce.reduceStr();
    }
    void reduceStr(String ...strs){

        String str = "abcdefg";
        String str2= Arrays.stream(str.split("")).reduce("done ",String::concat);
        System.out.println(" >>str2 >>"+str2);
    }
}
