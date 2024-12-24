package java11;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {

        List<String> arraylist = Arrays.asList("raja","rani");
        String[] array =  arraylist.toArray(String[]::new);

        System.out.println("array "+array);
    }
}
