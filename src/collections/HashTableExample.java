package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
//        HashMap<Integer,String> hashMap = new HashMap<>();
        Hashtable<Integer,String> hashMap = new Hashtable<>();
        hashMap.put(1,"Null val");
        hashMap.put(2,"Null val2");
        System.out.println(hashMap);
    }
}
