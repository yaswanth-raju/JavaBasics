package java11;

import java.util.ArrayList;

public class LocalVariable {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("ssssss");
        list.add("sssdddd");
        list.forEach(System.out::println);

    }
}
