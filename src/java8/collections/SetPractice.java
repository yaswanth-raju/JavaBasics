package java8.collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
//        ConcurrentSkipListSet<String > set = new ConcurrentSkipListSet<>();
        HashSet<String> set = new HashSet<>();
        List<String > arralist = new ArrayList<>();
//        Set<String> set2 = new HashSet<>();
        set.add("xyz");
        set.add("bcd");
        set.add("abc");
//        set.add("cde");

        for (String str:set
             ) {
            if(str.equals("bcd"))
            set.add("cdf");
        }
        System.out.println("Set size="+set);
    }
}
