package java8;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String > bif=(integer, integer2) -> {
            if(integer>integer2){
                return "success";
            }else {
                return "failure";
            }
        };
        System.out.println(bif.apply(1,2));
    }
}
