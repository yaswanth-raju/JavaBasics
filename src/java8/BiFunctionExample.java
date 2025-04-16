package java8;

import java.util.function.BiFunction;
import java.util.function.Function;


public class BiFunctionExample {
    static Function<String ,String > toUpper=(e)-> e.toUpperCase();

    public static void main(String[] args) {
        BiFunction<Integer,Integer,String > bif=(integer, integer2) -> {
            if(integer>integer2){
                return "success";
            }else {
                return "failure";
            }
        };

        String bifResult = bif
                            .andThen(toUpper)
                            .apply(1, 2);
        System.out.println(bifResult);
    }
}
